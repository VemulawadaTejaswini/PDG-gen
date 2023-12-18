import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int w = sc.nextInt(), d = sc.nextInt();
			if (w == 0 && d == 0) break;
			
			int[] h = new int[21];
			int ans = 0;
			for (int i = 0; i < w; i++) {
				int t = sc.nextInt();
				h[t]++;
				ans += t;
			}
			for (int i = 0; i < d; i++) {
				int t = sc.nextInt();
				if (h[t] > 0) h[t]--;
				else ans += t;
			}
			
			out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}