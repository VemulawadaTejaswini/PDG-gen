import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		for (int i = 0; i <= X; i++) {
			if (2 * i + (X - i) * 4 == Y) {
				System.out.println("Yes");
				System.exit(0);
			}
		}
		System.out.println("No");
	}
}