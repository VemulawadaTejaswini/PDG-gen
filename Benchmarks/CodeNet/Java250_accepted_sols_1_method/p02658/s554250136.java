import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] =  sc.nextLong();
			if(A[i] == 0) {
				System.out.println(0);
				return;
			}
		}

		long SUM = 1l;

		for (long I: A) {
			if (1000000000000000000L / I >= SUM) {
				SUM *= I;
			} else {
				System.out.println(-1);
				return;
			}
		}


		System.out.println(SUM);
		sc.close();
	}
}