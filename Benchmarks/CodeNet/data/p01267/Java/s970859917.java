import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, a, b, c, x;
		while (true) {
			n = sc.nextInt(); a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt(); x = sc.nextInt();
			if (n == 0) break;
			int[] y = new int[n];
			for (int i = 0; i < n; i++)
				y[i] = sc.nextInt();
			int ans = 0, index = 0;
			while (ans <= 10001) {
				if (y[index] == x) {
					if (index == n-1) break;
					index++;
				}
				ans++;
				x = (a*x+b)%c;
			}
			if (ans <= 10000)
				out.println(ans);
			else
				out.println(-1);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}