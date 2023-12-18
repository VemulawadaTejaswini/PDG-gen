import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int n, x, y, z;
		System.out.print("n > ");
		n = Integer.parseInt(new Scanner(System.in).next());
		if ((n >= 1) && (n <= 100)) {

			x = n * n * n;
			System.out.println(x);
		}
	}
}