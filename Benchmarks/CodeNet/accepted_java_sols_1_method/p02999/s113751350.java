import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int a = scan.nextInt();

		System.out.println(x < a ? 0 : 10);
	}
}