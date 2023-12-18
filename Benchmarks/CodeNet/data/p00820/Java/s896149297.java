import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	boolean isSquare(int n) {
		for (int i = (int)Math.sqrt(n); i*i <= n; i++) {
			if (i*i == n) return true;
		}
		return false;
	}
	
	void run() {
		int n;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			int ans = 0;
			
			for (int i = 1; i*i <= n; i++) {
				if (n-i*i == 0) ans++;
				for (int j = i; j*j <= n-i*i; j++) {
					if (n-i*i-j*j == 0) ans++;
					for (int k = j; k*k <= n-i*i-j*j; k++) {
						if (n-i*i-j*j-k*k == 0) ans++;
						else if (k*k <= n-i*i-j*j-k*k && isSquare(n-i*i-j*j-k*k)) ans++;
					}
				}
			}
			
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}