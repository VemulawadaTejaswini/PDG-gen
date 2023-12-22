import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Solution();
	}

}

class Solution {

	private int n;

	public Solution() {
		this.setScanner();
		this.run();
	}

	private void setScanner() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
	}

	private void run() {

		if (n < 4) {
			System.out.println("No");
			return;
		}

		for (int cake = 0; cake <= 100 / 4; cake++) {
			for (int donuts = 0; donuts <= 100 / 7; donuts++) {
				if (4 * cake + 7 * donuts == n) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");
	}

}