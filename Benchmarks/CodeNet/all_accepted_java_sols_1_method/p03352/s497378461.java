
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int pow = 0;
		int ans = 1;
		for (int i = 1; i < n; i++) {
			for (int j = 2; j < n; j++) {
				pow = (int) Math.pow(i, j);
				if (pow <= n) {
					ans = Math.max(ans, pow);
				}
			}
		}
		System.out.println(ans);
	}
}