//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			String A[] = new String[N];
			for(int i=0;i<N;i++) {
				char B[] = new char[10];
				B = sc.next().toCharArray();
				Arrays.sort(B);
				A[i] = new String(B);
				//System.out.println(A[i]);
			}
			HashMap<String,Integer>map = new HashMap<String,Integer>();
			long ans = 0;
			//System.out.println(map.get(A[0]));
			for(int i=0;i<N;i++) {
				if(map.containsKey(A[i])) {
					map.put(A[i],map.get(A[i])+1);
					//System.out.println(map.get(A[i]));
				}else {
					map.put(A[i],1);
				}
			}
		for(String key : map.keySet()) {
				long tmp = map.get(key);
				if(tmp>1) {
					ans += (tmp*(tmp-1)/2);
				}
			}
			System.out.println(ans);
	}
	
}