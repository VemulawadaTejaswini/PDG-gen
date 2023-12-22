import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println( a / k != b / k ? "OK" : a % k == 0 ? "OK" : "NG");
	}
}