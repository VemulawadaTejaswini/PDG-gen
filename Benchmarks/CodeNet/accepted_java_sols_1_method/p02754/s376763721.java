import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();

		long ans = (N / (A+B)) * A;
		long rem =  N % (A + B) > A ? A: N%(A + B);

		System.out.println(ans + rem);

	}
}
