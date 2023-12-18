import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long sum = 0;

		if (N == 0) {
			N = 1;
		} else {
			while (N == 0) {
				long tmp = N % 10;
				sum += tmp;
				N /= 10;
			}
		}
		String ans = "No";
		if (sum % 9 == 0)
			ans = "Yes";
		System.out.println(ans);

	}
}