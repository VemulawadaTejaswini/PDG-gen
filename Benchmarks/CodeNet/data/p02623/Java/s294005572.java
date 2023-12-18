import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int M = Integer.valueOf(s.next());
		long K = Long.valueOf(s.next());
		long[] A = new long[N+2];
		long[] B = new long[M+2];
		long[] dp = new long[M+2];
		int ret = 0;
		for(int i = 1; i <= N; i++) {
			A[i] = A[i-1] + Long.valueOf(s.next());
		}
		for(int i = 1; i <= M; i++) {
			B[i] = B[i-1] + Long.valueOf(s.next());
		}
		
		int index = M;
		for(int i = 0; i <= N; i++) {
			long target = K - A[i];
			for(int j = index; j >= 0; j--) {
				if(target >= B[j]) {
					ret = Integer.max(ret, i+j);
					break;
				}else {
					index = j;
				}
			}
		}
		
		System.out.println(ret);
	}
}