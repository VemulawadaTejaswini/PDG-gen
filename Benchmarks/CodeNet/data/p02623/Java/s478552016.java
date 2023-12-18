import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int ans = 0;
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		int[] A = new int[N + 1];
		int[] B = new int[M + 1];
		int Acount = 0;
		int Bcount = 0;

		for(int i = 0;i < N;i++) {
			A[i] = scan.nextInt();
		}

		for(int i = 0;i < M;i++) {
			B[i] = scan.nextInt();
		}

		A[N] = 1000000001;
		B[M] = 1000000001;

		while(true) {
			if(A[Acount] > B[Bcount]) {
				K -= B[Bcount];
				Bcount++;
			}else {
				K -= A[Acount];
				Acount++;
			}

			if(K < 0 || (Acout == N && Bcount == M)) {
				break;
			}

			ans++;
		}

		System.out.println(ans);

	}
}