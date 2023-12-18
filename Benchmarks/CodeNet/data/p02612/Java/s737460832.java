import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int result = 0;
		result = (N%1000 == 0) ? 0 : 1000 - (N % 1000);
		System.out.println(result);
	}
}