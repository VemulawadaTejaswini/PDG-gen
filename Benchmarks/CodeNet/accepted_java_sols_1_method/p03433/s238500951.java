import java.util.Scanner;

public class Main {
	static int[][] bingo = new int[3][3];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int a = Integer.parseInt(sc.next());

		while (n >= 500) {
			n -= 500;
		}

		if (n <= a) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
