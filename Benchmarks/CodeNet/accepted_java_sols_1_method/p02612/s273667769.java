import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		int y = (int)((Math.ceil(n / 1000.0)) * 1000);
		int a = Math.abs(y - n);

		System.out.println(a);

	}
}