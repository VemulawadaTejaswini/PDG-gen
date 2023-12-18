import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int[] time = new int[1000];
		int[] sum = new int[1000];
		while (true) {
			int n = sc.nextInt();
			if (n == 0) break;
			Arrays.fill(time, -1);
			Arrays.fill(sum, 0);
			for (int i = 0; i < n; i++) {
				sc.next();
				String t = sc.next();
				int min = 60*Integer.parseInt(t.substring(0, 2)) + Integer.parseInt(t.substring(3));
				char c = sc.next().charAt(0);
				int num = sc.nextInt();
				if (c == 'I') {
					time[num] = min;
				} else {
					if (num == 0) {
						for (int j = 1; j < 1000; j++) {
							if (time[j] >= 0) {
								sum[j] += min - max(time[0], time[j]);
							}
						}
						time[0] = -1;
					} else {
						if (time[0] >= 0) {
							sum[num] += min - max(time[0], time[num]);
						}
						time[num] = -1;
					}
				}
			}
			int res = -1;
			for (int i = 1; i < 1000; i++)
				res = max(res, sum[i]);
			out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}