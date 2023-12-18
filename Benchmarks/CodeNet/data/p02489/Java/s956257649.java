import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, i;
		x = in.nextInt();
		for (i = 1;; i++) {
			if (x != 0) {
				System.out.println("case" + i + ": " + x);
				x = in.nextInt();
			} else {
				break;
			}
		}
	}
}