
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a,b, coin = 0;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		
		for (int i = 1; i <= 2; i++) {
			if (a < b) {
				coin += b;
				b--;
			} else {
				coin += a;
				a--;
			}
		}
		
		System.out.println(coin);

	}

}
