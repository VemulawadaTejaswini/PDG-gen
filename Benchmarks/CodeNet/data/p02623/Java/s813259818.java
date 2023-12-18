import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int N = Integer.valueOf(s.next());
		int M = Integer.valueOf(s.next());
		long K = Long.valueOf(s.next());
		long[] A = new long[N+1];
		long[] B = new long[M+1];
		for(int i = 0; i < N; i++) {
			A[i] = Long.valueOf(s.next());
		}
		for(int i = 0; i < M; i++) {
			B[i] = Long.valueOf(s.next());
		}
		A[N] = B[M] = K;
		
		int ret = 0;
		Queue<int[]> Q = new ArrayDeque<>();
		int[] start = {-1, -1, 0}; // 0=a, 1=b, 2=所用時間
		Q.add(start);
		while(!Q.isEmpty()) {
			int[] tmp = Q.poll();
			if(A[tmp[0]+1] < B[tmp[1]+1]) {
				if(K >= tmp[2] + A[tmp[0]+1]) {
					tmp[2] += A[tmp[0]+1];
					tmp[0]++;
					Q.add(tmp);
				}else {
					ret = Integer.max(ret, tmp[0] + tmp[1] + 2);
				}
			}else if(A[tmp[0]+1] > B[tmp[1]+1]) {
				if(K >= tmp[2] + B[tmp[1]+1]) {
					tmp[2] += B[tmp[1]+1];
					tmp[1]++;
					Q.add(tmp);
				}else {
					ret = Integer.max(ret, tmp[0] + tmp[1] + 2);
				}
			}else {
				if(tmp[1] < M && K >= tmp[2] + B[tmp[1]+1]) {
					tmp[1]++;
					tmp[2] += B[tmp[1]+1];
					Q.add(tmp);
				}
				if(tmp[0] < N && K >= tmp[2] + A[tmp[0]+1]) {
					tmp[0]++;
					tmp[2] += A[tmp[0]+1];
					Q.add(tmp);
				}
				if(tmp[1] + 1 == M && tmp[0] + 1 == N) {
					ret = Integer.max(ret, tmp[0] + tmp[1] + 2);
				}
			}
		}
		System.out.println(ret);
	}
}