import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		int[] ary = new int[5];

		for (int i = 0; i < ary.length; i++) {
			ary[i] = sc.nextInt();
		}

		int k = sc.nextInt();

		boolean yay = true;

		loop: for (int i : ary) {
			for (int j : ary) {
				if (!(i - j <= k)) {
					yay = false;
					break loop;
				}
			}
		}

		System.out.println(yay ? "Yay!" : ":(");

	}
}
