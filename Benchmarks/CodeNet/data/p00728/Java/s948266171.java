
import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n;
		int a[];
		int ans;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Arrays.sort(a);
			ans = 0;
			for (int i = 1; i < n-1; i++) {
				ans += a[i];
			}
			System.out.println(ans/(n-2));
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}