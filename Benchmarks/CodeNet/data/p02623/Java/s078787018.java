import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		int[] A = new int[N];
		int[] B = new int[M];
		int kosu = N + M;
		int[] atai = new int[kosu];
		int a = 0;
		int b = 0;

		int wa = 0;
		int goukei = 0;

		//入力
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}
		//並べる
		for (int i = 0; i < kosu; i++) {
				if ((a < N) && (b < M)) {
					if (A[a] < B[b]) {
						atai[i] = A[a];
						a++;
					} else if (B[b] < A[a]) {
						atai[i] = B[b];
						b++;
					}
				} else if ((N <= a) && (b < M)) {
					atai[i] = B[b];
					b++;
				} else if ((a < N) && (M <= b)) {
					atai[i] = A[a];
					a++;
				}
			
		}

		for (int i = 0; i < kosu; i++) {
			wa = wa+atai[i];
			if (wa < K) {
				goukei++;
			}
		}
		System.out.println(goukei);

		sc.close();

	}

}