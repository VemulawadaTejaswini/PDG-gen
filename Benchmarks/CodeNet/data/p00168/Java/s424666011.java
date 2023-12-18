import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			
			if(n == 0) {
				break;
			}
			
			long ans = dfs(n);
			if(ans % 10 == 0) {
				ans /= 10;
			}
			else {
				ans /= 10;
				ans += 1;
			}
			if(ans % 365 == 0) {
				System.out.println(ans / 365);
			}
			else {
				System.out.println(ans / 365 + 1);
			}
		}
	}
	
	public static long dfs(int n) {
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			return 0;
		}
		long ans = 0;
		ans += dfs(n - 1);
		ans += dfs(n - 2);
		ans += dfs(n - 3);
		return ans;
	}
}