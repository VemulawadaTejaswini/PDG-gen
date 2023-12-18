import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = Integer.parseInt(sc.nextLine());
			if(n==0)break;
			String[][] ss = new String[n][];
			TreeMap<String,Integer>[]map=new TreeMap[26];
			for (int i = 0; i < map.length; i++) {
				map[i]=new TreeMap<String,Integer>();
			}
			for(int i=0;i<n;i++){
				ss[i]=sc.nextLine().split(" ");
				for (int j = 0; j < ss[i].length; j++) {
					int num = ss[i][j].charAt(0)-'a';
					if(map[num].containsKey(ss[i][j])){
						map[num].put(ss[i][j], map[num].get(ss[i][j])+1);
					} else{
						map[num].put(ss[i][j], 1);
					}
				}
			}
			int num = sc.nextLine().charAt(0)-'a';
			if(map[num].entrySet().size()==0){
				System.out.println("NA");
			} else {
				int max=-1;
				SI[] si = new SI[map[num].entrySet().size()];
				int i=0;
				for(Entry<String,Integer> e:map[num].entrySet()){
					si[i]=new SI();
					si[i].n=e.getValue();
					si[i].s=e.getKey();
					i++;
				}
				Arrays.sort(si,new Comparator<SI>(){

					@Override
					public int compare(SI arg0, SI arg1) {
						if(arg0.n==arg1.n){
							return arg0.n-arg1.n;
						}
						return arg0.s.compareTo(arg1.s);
					}
					
				});
				StringBuffer sb=new StringBuffer();
				for(i=0;i<si.length;i++){
					sb.append(" ");
					sb.append(si[i].s);
					if(i==4)break;
				}
				System.out.println(sb.toString().substring(1));
				LinkedList<String> list=new LinkedList<String>();
				for(Entry<String,Integer> e:map[num].entrySet()){
					if(max==e.getValue()){
						list.add(e.getKey());
					}
					if(list.size()==5){
						break;
					}
				}
				for(String s:list){
//					sb.append(" ");
//					sb.append(s);
				}
//				System.out.println(sb.toString().substring(1));
			}
		}
	}
	static class SI{
		String s;
		int n;
	}
}