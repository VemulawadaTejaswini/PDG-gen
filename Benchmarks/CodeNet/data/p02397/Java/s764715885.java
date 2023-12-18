import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x, y, box = 0;
		while (true) {
			x = stdIn.nextInt();
			y = stdIn.nextInt();
			if(x == 0 && y == 0)break;
			if (x > y) {
				box = x;
				x = y;
				y = box;
			}
			System.out.println(x + " " + y);
		}

	}
}