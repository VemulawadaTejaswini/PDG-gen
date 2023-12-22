import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[101];
		int[] b = new int[101];
		ArrayList<Integer> list = new ArrayList<Integer>();
		String s = "";
		int i = 0;
		int count = 0;
		
		while(true){
			s = sc.next();
			if(s.compareTo("0,0")==0) break;
			i = 0;
			while(s.substring(i,i+1).compareTo(",")!=0)i++;
			a[count] = Integer.valueOf(s.substring(0,i));
			b[count] = Integer.valueOf(s.substring(i+1, s.length()));
			if(list.contains(b[count])==false) list.add(b[count]);
			count++;
		}
		Collections.sort(list);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			for(int j=0;;j++){
				if(a[j]==n){
					i = list.indexOf(b[j]);
					System.out.println(list.size()-i);
					break;
				}
			}
		}
	}	
}