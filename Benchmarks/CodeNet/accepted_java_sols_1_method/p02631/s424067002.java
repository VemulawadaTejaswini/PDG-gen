import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		int[] bits = new int[len];

		int xored = 0;
		for (int i = 0; i < len; i++) {
			bits[i] = sc.nextInt();
			if (i > 0) {
				xored = xored ^ bits[i];
			}
		}

		System.out.print(xored);

		for (int i = 0; i < len - 1; i++) {
			xored = xored ^ bits[i] ^ bits[i + 1];
			System.out.print(" " + xored);
		}
	}

}