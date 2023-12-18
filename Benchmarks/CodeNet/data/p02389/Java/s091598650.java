import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String[] a = x.split(" ");
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(a[i]);

		}
		System.out.println((b[0] * b[1]) + " " + (2 * b[0] + 2 * b[1]));
	}
}