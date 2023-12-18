import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int x;

		x = Integer.parseInt(new Scanner(System.in).next());
		if ((x >= 1) && (x <= 100)) {

			x = x * x * x;
			System.out.println(x);
		}
	}
}