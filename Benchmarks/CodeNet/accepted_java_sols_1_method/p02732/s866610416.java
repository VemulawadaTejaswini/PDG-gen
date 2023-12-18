import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long add = 0;
    	long ans = 0;
    	
		int N = sc.nextInt();
		long arry[]=new long[N+1];
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(int i=1;i<=N;i++){
			long key1=sc.nextInt();
			arry[i]=key1;
			if (map.containsKey(key1)){
				map.put(key1,map.get(key1)+1);
			}
			else{
				map.put(key1,(long) 1);
			}
		}
//		for (Integer val : map.values()) {
//			add=add+val;
//		}
		for (Long key : map.keySet()) {
			add=add+(map.get(key)*(map.get(key)-1)/2);
		}
		for(int i=1;i<=N;i++){
			ans=add-(map.get(arry[i])-1);
			System.out.println(ans);
		}
    }
}