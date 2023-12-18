import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.printf("%d %d %f\n", (a / b), (a % b), (double)a / b);
		scan.close();
	}
}