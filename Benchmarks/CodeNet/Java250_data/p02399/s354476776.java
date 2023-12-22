import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();

		if (1 <= a && a <= 1000000000 && 1 <= b && b <= 1000000000) {
			int d = a / b;
			int r = a % b;
			double f = (double)a / (double)b;
			System.out.print(d + " " + r + " ");
			System.out.printf("%5.8f", f);
		}

	}

}