
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int[] cnt = new int[100];
		while(sc.hasNext()) {
			int n = sc.nextInt()-1;
			cnt[n]++;
			max = max(max, cnt[n]);
		}
		
		for(int i=0;i<100;i++) if( cnt[i] == max ) System.out.println((i+1));
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}