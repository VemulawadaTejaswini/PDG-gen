import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 3;
		int b = 2;
		int d = 0;
		int r = 0;
		double f = 0;
		d = a / b;
		r = a % b;
		f = a / b;
		f = f * a / b;


		System.out.printf("%d %d %f",d, r, f);


	}
}