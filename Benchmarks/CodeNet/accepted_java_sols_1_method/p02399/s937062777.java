import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		Double c = Double.valueOf(a) / Double.valueOf(b);

		System.out.println(a / b + " " + a % b + " " + String.format("%.8f", c));

	}

}

