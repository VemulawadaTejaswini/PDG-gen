import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();

		int S = a * b;
		int T = 2 * (a + b);
		System.out.println(S + " " + T);
	}

}

