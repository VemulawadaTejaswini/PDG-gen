import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 1, x;
		Scanner sc = new Scanner(System.in);
		while (true) {
			x = sc.nextInt();
			if (x == 0) break;
			System.out.println("Case" + i++ + ": " + x);
		}
		sc.close();
	}
}
