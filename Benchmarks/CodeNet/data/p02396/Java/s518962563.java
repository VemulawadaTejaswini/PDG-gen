import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int i = 1;
		do {
			x = sc.nextInt();
			System.out.println("Case " + i + ": " + x);
			i += 1;
		} while (x != 0);
	}
}
