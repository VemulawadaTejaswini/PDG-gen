import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		long N;
		long A;
		long B;
		long X;
		long mod;
		Scanner sc = new Scanner(System.in);
		N = sc.nextLong();
		A = sc.nextLong();
		B = sc.nextLong();
		X = N / (A + B);
		mod = N % (A + B);
		System.out.println(X * A + Math.min(mod, A));
		sc.close();
	}

}