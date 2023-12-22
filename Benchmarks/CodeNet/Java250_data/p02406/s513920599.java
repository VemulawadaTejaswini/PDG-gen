import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + x);
			} else {
				String value = String.valueOf(x);
				for (int index = value.length(); index > 0; index--) {
					if (x / (int) Math.pow(10, index - 1) % 10 == 3) {
						System.out.print(" " + x);
						break;
					}
				}
			}
		}
		System.out.println();
		sc.close();
	}
}
