import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long[] A = new long[N];
		long X = 1;

		for (int i = 0; i < N; i++) {
			if(X > 0 && X <= (long) Math.pow(10, 18)) {
				A[i] = scan.nextLong();
				X = X * A[i];
			}
		}

		if(X >= 0 && X <= (long) Math.pow(10, 18)) System.out.println(X);
		else System.out.println("-1");
	}
}
