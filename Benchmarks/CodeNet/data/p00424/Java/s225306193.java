import java.util.*;

public class Main {
	public static Scanner sc;
	public static StringBuilder sb;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		sb=new StringBuilder();
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			Map<String,String> map=new HashMap<String,String>();
			for(int i=0;i<n;i++){
				map.put(sc.next(),sc.next());
			}
			int m=sc.nextInt();
			for(int i=0;i<m;i++){
				String s=sc.next();
				if(map.containsKey(s))sb.append(map.get(s));
				else sb.append(s);
			}
			System.out.println(sb.toString());
		}
	}
}