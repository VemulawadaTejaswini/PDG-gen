import java.util.Scanner;

public class Aim {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);

		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = (double) a / b;
		
		System.out.println(d + " " + r + " " + f);
	}
}

