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
		
		long ret = Integer.MIN_VALUE;
		long cur = 0;
		int idx = 0;
		for(int i = 1; i <= N; i++) {
			idx = P[i];
			cur = C[idx];
			ret = Long.max(ret, cur);
			for(int j = 1; j < K; j++) {
				idx = P[idx];
				cur += C[idx];
				ret = Long.max(ret, cur);
			}
		}
		
		System.out.println(ret);
	}
}