import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), x = sc.nextInt(), t = sc.nextInt();
		int r = ((n - 1 ) / x + 1) * t;
		System.out.println(r);

	}
}
