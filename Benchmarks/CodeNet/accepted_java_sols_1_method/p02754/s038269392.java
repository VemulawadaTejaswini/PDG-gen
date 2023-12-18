import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();
		long x = N / (A + B);
		N = N - (A + B) * x;
		long ret = A * x + Math.min(N, A);
		System.out.println(ret);
	}
}
