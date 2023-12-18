import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		int n = b - a;
		int ans = (n * (n + 1)) / 2 - b;
		System.out.println(ans);

	}
}