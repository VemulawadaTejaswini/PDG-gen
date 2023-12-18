import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		sc.close();

		int y = (n + x - 1) / x;
		System.out.println(y * t);
	}
}
