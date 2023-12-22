import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String N = sc.next();
		int sum = 0;

		if (N.substring(0).startsWith("1")) {
			sum++;
		}
		if (N.substring(1).startsWith("1")) {
			sum++;
		}
		if (N.substring(2).startsWith("1")) {
			sum++;
		}

		System.out.println(sum);

		sc.close();
	}
}