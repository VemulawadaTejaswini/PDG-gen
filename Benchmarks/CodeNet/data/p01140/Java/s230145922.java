import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int n, m;
	short[] cntx, cnty;
	int[] x, y;
	
	public void run() {
		while (true) {
			n = in.nextInt();
			m = in.nextInt();
			if (n == 0 && m == 0) break;
			cntx = new short[1500001];
			cnty = new short[1500001];
			x = new int[n];
			y = new int[m];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
			}
			for (int i = 0; i < m; i++) {
				y[i] = in.nextInt();
			}
			
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum += x[j];
					cntx[sum]++;
				}
			}
			
			for (int i = 0; i < m; i++) {
				int sum = 0;
				for (int j = i; j < m; j++) {
					sum += y[j];
					cnty[sum]++;
				}
			}
			
			int ans = 0;
			for (int i = 1; i < cntx.length; i++) {
				ans += cntx[i] * cnty[i];
			}
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}