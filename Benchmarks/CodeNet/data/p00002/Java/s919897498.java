package question01;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();

		int c = a + b;

		int cnt = 1;


		while(c / 10 != 0) {
			c /= 10;
			cnt++;
		}

		System.out.println(cnt);

	}
}