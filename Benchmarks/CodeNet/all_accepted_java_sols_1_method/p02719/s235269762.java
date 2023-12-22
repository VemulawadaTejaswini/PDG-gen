import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long K = scan.nextLong();

		long x = N%K;
		long y = Math.abs(x-K);

		if (x > y) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}
	}

}