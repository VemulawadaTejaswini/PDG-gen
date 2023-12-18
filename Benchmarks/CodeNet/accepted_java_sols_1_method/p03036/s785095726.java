import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int c = x;
		for (int i = 1; i < 11; i++) {
			System.out.println(r * c - d);
			c = r * c - d;
		}

	}
}