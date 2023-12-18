
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if(n == 0) break;

			String[][] tk = new String[n][5]; int p = 0;
			for(int i=0;i<n;i++) for(int j=0;j<5;j++)
				tk[i][j] = sc.next();

			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int i=0;i<n;i++) {
				if(!map.containsKey(tk[i][1])) map.put(tk[i][1], p++);
				if(!map.containsKey(tk[i][4])) map.put(tk[i][4], p++);
			}

			int[][] d = new int[p][p]; for(int[] a: d) fill(a, INF);
			for(int i=0;i<n;i++) {
				d[map.get(tk[i][1])][map.get(tk[i][4])] = Integer.parseInt(tk[i][3].substring(3));
				d[map.get(tk[i][4])][map.get(tk[i][1])] = -Integer.parseInt(tk[i][3].substring(3));
			}

			for(int i=0;i<p;i++) d[i][i] = 0;

			for(int k=0;k<p;k++) for(int i=0;i<p;i++) for(int j=0;j<p;j++) {
				d[i][j] = min(d[i][j], d[i][k] + d[k][j]);
			}

			boolean flg = false;
			for(int i=0;i<p;i++) flg |= d[i][i] < 0;

			System.out.println((flg? "No": "Yes"));
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}