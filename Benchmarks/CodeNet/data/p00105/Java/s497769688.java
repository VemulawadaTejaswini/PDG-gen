import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String table[]=new String[100000];
		int now=0;
		HashMap<String ,ArrayList<Integer > > map=new HashMap<String, ArrayList<Integer> >();
		while(s.hasNext()){
			String str=s.next();
			int a=s.nextInt();
			if(map.containsKey(str)){
				map.get(str).add(a);
			}
			else{
				table[now++]=str;
				ArrayList<Integer> p=new ArrayList(0);
				p.add(a);
				map.put(str,p);
			}
		}
		Arrays.sort(table,0,now);
		for(int i=0;i<now;i++){
			Integer dat[]=map.get(table[i]).toArray(new Integer[100]);
			Arrays.sort(dat,0,map.get(table[i]).size());
			System.out.println(table[i]);
			System.out.print(dat[0]);
			for(int j=1;j<map.get(table[i]).size();j++)
				System.out.print(" "+dat[j]);
			System.out.println();
		}
	}
}