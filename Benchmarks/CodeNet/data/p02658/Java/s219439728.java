import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] an = new long[n];

		for (int i = 0; i < n; i++) {
			long a = scan.nextLong();
			an[i] = a;
		}

		long ans = an[0];
		for (int i = 1; i < an.length; i++) {
			ans *= an[i];
		}

		if (ans <= (long) Math.pow(10, 18)) {
			System.out.println(ans);
		} else {
			System.out.println("-1");
		}

		scan.close();
	}

}
