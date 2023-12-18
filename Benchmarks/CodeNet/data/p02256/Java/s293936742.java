import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		for (int i = x; i > 1; i--) {
			if (x % i == 0 && y % i == 0) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(1);
	}
}

