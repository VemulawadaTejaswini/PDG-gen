import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);;
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println(a / b + " " + a % b + " " + String.format("%.8f", (double)a / b));
		scan.close();
	}
}
