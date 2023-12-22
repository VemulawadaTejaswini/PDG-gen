import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int f_overflow = 0;
		int f_zero = 0;
		long[] A = new long[N];
		long X = 1;

		for(int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}

		for(int i = 0; i < N; i++) {
			if(A[i] == 0) {
				X = 0; f_zero = 1;
			}
		}

		if(f_zero == 0) {
			for (int i = 0; i < N; i++) {
				if(X * A[i] / A[i] == X && X <= (long) Math.pow(10, 18)) {
					X = X * A[i];
				} else {
					f_overflow++;
					break;
				}
			}
		}

		if(f_overflow == 0 && X <= (long) Math.pow(10, 18)) System.out.println(X);
		else System.out.println("-1");
	}
}
