import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int A[] = new int[N];
		for(int i=0;i<N;i++) A[i]=sc.nextInt();
		sc.close();
		
		//test
//		int N = (int)1e5;
//		int M = (int)1e4;
//		int A[] = new int[N];
//		Arrays.fill(A, 2);
		
		
		int sum[] = new int[N];
		sum[0]=A[0]%M;
		for(int i=1;i<N;i++) {
			sum[i] =  (sum[i-1] + A[i])% M;
		}
		Map<Integer,Long> map = new HashMap<Integer,Long>();
		for(int i=0;i<sum.length;i++) {
			if(map.containsKey(sum[i])) {
				long now = map.get(sum[i]); 
				map.put(sum[i],++now);
			}else {
				map.put(sum[i], 1L);
			}
		}
		long ans = 0;
		//map は　keySetを利用して全操作する。
		for(int key:map.keySet()) {
			long value = map.get(key);
			long add = (value-1)*value/2;
			ans += add;
		}
		//0の時だけ自分自身だけでもカウント出来る。
		if(map.containsKey(0))ans += map.get(0);
		System.out.println(ans);
	}
}
