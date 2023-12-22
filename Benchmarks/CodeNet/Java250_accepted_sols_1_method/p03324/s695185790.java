
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		int n = scan.nextInt();
		
		int ans = (int)Math.pow(100, d) * (n + n / 100);
		System.out.println(ans);
	}
}