import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N,K;
		N =sc.nextLong();
		K =sc.nextLong();
		long a= N-N/K*K;
		if (a>Math.abs(a-K)) {
			System.out.println(Math.abs(a-K));
		} else {
			System.out.println(a);
		}
	}
}