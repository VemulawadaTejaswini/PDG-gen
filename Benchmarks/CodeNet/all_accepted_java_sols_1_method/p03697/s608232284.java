import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int a = 0, b = 0;
		a = stdin.nextInt();
		b = stdin.nextInt();
		if (a + b >= 10) {
			System.out.println("error");
		} else {
			System.out.println(a + b);
		}
	}

}
