import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		int one = 1900 * m + 100 * (n - m);
		System.out.println(one * (int) Math.pow(2, m));
	}
}
