import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();

		for (int i = 0; i < X.length(); i++) {
			int let = X.charAt(i) + N;
			if (let > 90) {
				let = let - 26;
			}
			System.out.print((char)let);
		}

	}
}