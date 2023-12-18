import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		long[] num = new long[9];
		int[] ups = new int[32];
		for (int u = 0; u < n; u++) {
			for (int i = 0; i < 9; i++)
				num[i] = Long.decode("0x"+sc.next());
			Arrays.fill(ups, 0);
			long m = 0;
			int c;
			long k = 0;
			for (int i = 0; i < 32; i++) {
				c = 0;
				for (int j = 0; j < 8; j++) {
					if (((num[j] >> i) & 1) == 1) {
						c++;
					}
				}
				int t;
				if ((((m>>i)+c) & 1) != ((num[8] >> i) & 1)) {
					k += (1L<<i);
					t = 1;
				} else {
					t = 0;
				}
				for (int j = 0; j < 8; j++) {
					m += ((((num[j] >> i) & 1)^t)<<i);
				}
			}
			out.println(Long.toHexString(k));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}