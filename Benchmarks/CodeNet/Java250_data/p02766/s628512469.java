import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int r = scan.nextInt();

		int ans = 1;
		while(true) {
			if(n < Math.pow(r, ans) ) {
				System.out.println(ans);
				return;
			}
			ans++;
		}
	}
}