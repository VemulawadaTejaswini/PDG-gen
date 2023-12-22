import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N+1];
		int[] B = new int[N];
		for (int i=0;i<N+1;i++) {
			A[i] = Integer.parseInt(sc.next());
		}
		for (int i=0;i<N;i++) {
			B[i] = Integer.parseInt(sc.next());
		}
		long cnt = 0L;

		for (int i=0;i<N;i++) {
			if (A[i]>=B[i]) {
				cnt+=B[i];
			} else {
				cnt+=A[i];
				int tmp = B[i]-A[i];
				if (A[i+1]>=tmp) {
					A[i+1]-=tmp;
					cnt+=tmp;
				} else {
					cnt+=A[i+1];
					A[i+1]=0;
				}
			}
		}
		System.out.println(cnt);
	}
}