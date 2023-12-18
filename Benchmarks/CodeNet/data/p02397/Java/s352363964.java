import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			} else if (x < y) {
				System.out.print(x + " ");
				System.out.println(y);
			} else {
				System.out.print(y + " ");
				System.out.println(x);
			}
		}
	}
}
