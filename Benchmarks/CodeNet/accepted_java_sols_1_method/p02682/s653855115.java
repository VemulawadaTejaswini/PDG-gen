import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int k = stdIn.nextInt();

		if(k <= a) {
			System.out.println(k);
		} else if(k <= a + b) {
			System.out.println(a);
		} else {
			int res = k - a - b;
			System.out.println(a - res);
		}

		System.out.println();

		stdIn.close();
	}
}
