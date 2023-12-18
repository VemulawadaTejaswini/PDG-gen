import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a = n / 100;
		int c = n % 10;
		int b = (n - 100 * a - c) / 10;

		if(a == 7 || b == 7 || c == 7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
