import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();
		sc.close();

		int min = 1000;

		int[] val = { p + q, p + r, q + r };
		for (int i : val) {
			min = Math.min(min, i);
		}
		System.out.println(min);

	}

}
