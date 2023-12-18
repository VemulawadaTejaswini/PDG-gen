import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n = sc.nextInt();
		double rs = Math.ceil(100000 * n * 0.05 / 10000);
		int a = 100000 + (int) (rs * 10000);

		System.out.println(a);

	}

}