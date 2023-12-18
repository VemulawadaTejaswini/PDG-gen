import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long A[] = new long[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		for (int i=0;i<K;i++) {
			long B[] = new long[N];
			int countN =0;
			for (int j=0;j<N;j++) {
				if (j<i) {
					B[j] =j;
				} else {
					B[j]=i;
				}
				if (j+i<N) {
					B[j]+=i;
				} else {
					B[j]+=N-j-1;
				}
				B[j]++;
				for (int k=0;k<j-i;k++) {
					if (A[k]>=j-k) {
						B[j]++;
					}
				}
				for (int k=j+i+1;k<N;k++) {
					if (A[k]>=k-j) {
						B[j]++;
					}
				}
				if (B[j]==N) {
					countN++;
				}
			}
			A=B;
			if (countN ==N) {
				break;
			}
		}
		for (int j=0;j<N;j++) {
			System.out.print(A[j]+" ");
		}
	}
}