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
				for (int k=(int)-A[j];k<=A[j];k++) {
					if (j+k>=0&&j+k<N) {
						B[j+k]++;
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
