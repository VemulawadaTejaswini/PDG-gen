import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, q;
		int[] date = new int[101];
		while (true) {
			n = sc.nextInt(); q = sc.nextInt();
			if (n == 0) break;
			Arrays.fill(date, 0);
			for (int i = 0; i < n; i++) {
				int k = sc.nextInt();
				for (int j = 0; j < k; j++) {
					date[sc.nextInt()]++;
				}
			}
			
			int index = 0;
			int max = -1;
			for (int i = 0; i < 101; i++) {
				if (max < date[i] && q <= date[i]) {
					max = date[i];
					index = i;
				}
			}
			out.println(index);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}