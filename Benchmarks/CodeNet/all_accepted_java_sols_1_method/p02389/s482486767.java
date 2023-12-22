import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = a * b;
		int len = 2 * a + 2 * b;
		System.out.println(sum + " " + len);
	}
}