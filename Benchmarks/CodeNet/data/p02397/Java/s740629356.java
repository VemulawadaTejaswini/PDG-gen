import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int N = 3000;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3000; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (x != 0 || y != 0) {
				if (x < y) {
					System.out.println(x + " "+ y);
				} else {
					System.out.println(y + " " + x);
				}
			}
		}
	}

}