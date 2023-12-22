import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String NS = scanner.next();
		scanner.close();

		int NI = Integer.parseInt(NS);
		int A = 0;

		for (int n = 0; n < NS.length(); n++) {
			String ns = NS.substring(n, n + 1);
			int a = Integer.parseInt(ns);
			A = A + a;
		}
		if (NI % A == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}