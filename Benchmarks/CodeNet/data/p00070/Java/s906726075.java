
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int cnt[][] = new int [11][340];
	boolean used[] = new boolean[10];
	void run() {
		Scanner sc = new Scanner(System.in);
		search(0, 10, 0, used);
		for(;sc.hasNext();) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(cnt[n][s]);
		}
	}
	
	void search(int i, int n, int s, boolean[] used) {
//		System.out.println(s + " " + sum);
		cnt[i][s]++;
		if(i==n) return;
		for(int j=0;j<10;j++) {
			if(!used[j]) {
				used[j] = true;
				search(i+1, n, s+j*(i+1), used);
				used[j] = false;
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}