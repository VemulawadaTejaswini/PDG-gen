import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		for (int a = 1; a <= 9; a++) {
			if (x % a == 0 && x / a <= 9) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
