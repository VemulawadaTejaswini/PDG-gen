import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int c = 1;
		while (x != 0) {
			System.out.println("Case " + c + ": " + x);
			c++;
			x = sc.nextInt();
		}

	}
}

