import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int K = Integer.valueOf(s.next());
		int[] P = new int[N+1];
		int[] C = new int[N+1];
		
		for(int i = 1 ; i <= N; i++) {
			P[i] = Integer.valueOf(s.next());
		}
		for(int i = 1 ; i <= N; i++) {
			C[i] = Integer.valueOf(s.next());
		}
		
		boolean[] used = new boolean[N+1];
		
		long ret = Integer.MIN_VALUE;
		long cur = 0;
		int idx = 0;
		for(int i = 1; i <= N; i++) {
			idx = P[i];
			cur = C[idx];
			ret = Long.max(ret, cur);
			used[i] = true;
			
			int cnt = 1;
			while(true) {
				if(used[idx] || cnt >= K) break;
				used[idx] = true;
				cnt++;
				idx = P[idx];
				cur += C[idx];
				ret = Long.max(ret, cur);
			}
			used = new boolean[N+1];
			
			if(cur > 0 && K >= cnt) {
				cur = cur * (K / cnt);
				int idx2 = P[i];
				for(int j = 0; j < (K % cnt); j++) {
					cur += C[idx2];
					idx2 = P[idx2];
					ret = Long.max(ret, cur);
				}
			}
		}
		
		System.out.println(ret);
	}
}