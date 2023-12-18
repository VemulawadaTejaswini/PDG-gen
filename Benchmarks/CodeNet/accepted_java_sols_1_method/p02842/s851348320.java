import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		sc.close();

		double x = n / 1.08;
		int a = (int) Math.ceil(x);

		int n1 = (int) Math.floor((a - 1) * 1.08);
		int n2 = (int) Math.floor(a * 1.08);
		int n3 = (int) Math.floor((a + 1) * 1.08);

		if (n == n1 || n == n2 || n == n3) {
			System.out.println(a);
		} else {
			System.out.println(":(");
		}

	}

}
