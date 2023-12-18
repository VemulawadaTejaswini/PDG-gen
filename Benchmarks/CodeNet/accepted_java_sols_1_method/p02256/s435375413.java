import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int answer = 0;

		while(true) {
			if(x > y) {
				if(x % y == 0) {
					answer = y;
					break;
				}
				x %= y;
			} else {
				if(y % x == 0) {
					answer = x;
					break;
				}
				y %= x;
			}
		}

		System.out.println(answer);
	}
}

