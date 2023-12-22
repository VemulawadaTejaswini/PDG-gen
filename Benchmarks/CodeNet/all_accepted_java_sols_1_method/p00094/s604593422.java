import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		int a = stdin.nextInt();
		int b = stdin.nextInt();

		int s = a * b;
		double tsubo = 3.305785;

		double area = (double)s / tsubo;

		System.out.println(area);



	}
}