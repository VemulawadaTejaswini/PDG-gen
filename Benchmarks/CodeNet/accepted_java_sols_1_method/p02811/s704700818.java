import java.util.Scanner;

public class Main {
	static final int COIN = 500;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		if (COIN * x >= y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}