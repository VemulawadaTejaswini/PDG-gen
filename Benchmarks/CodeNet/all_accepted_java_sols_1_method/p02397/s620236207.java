import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y ==0) {
				sc.close();
				break;
			}
			if (x > y) {
				int tmp = x;
				x = y;
				y = tmp;
			}
			System.out.println(x + " " + y);
		}
	}
}