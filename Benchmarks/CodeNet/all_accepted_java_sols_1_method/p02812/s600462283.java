
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		n = scan.nextInt();
		String ss = scan.next();
		char[] c = ss.toCharArray();

		int ans = 0;
		for(int i = 0; i <= n-3; i ++) {
			if(c[i] == 'A' && c[i+1] == 'B' && c[i+2] == 'C') {
				ans++;
			}
		}

		System.out.println(ans);

	}
}
