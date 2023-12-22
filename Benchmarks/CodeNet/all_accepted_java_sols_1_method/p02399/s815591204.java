import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = (double) a / (double)b;
		System.out.printf("%d %d %.10f\n", d, r, f);
	}
}

