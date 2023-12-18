import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n;
	static int r[];
	static int x[];
	static int y[];
	static int c[];

	static int on[][];
	static boolean dp[];
	static boolean table[][];

	static void solve() {
		//int bit = 0;
		dp[0] = true;
		makeTable();
		//0の時に円盤を2枚取れるか全て計算
		//		for (int s = 0; s < n; s++) {
		//			//s + 1ビット目が0なら
		//			//System.out.println("s = " + s);
		//			for (int k = s + 1; k < n; k++) {
		//				if (canGet(bit, s, k)) {
		//					dp[(1 << s) + (1 << k)] = true;
		//				}
		//			}
		//		}
		//
		//		for (int i = 0; i < n; i++) {
		//			for (int j = i + 1; j < n; j++) {
		//				bit = (1 << i) + (1 << j);
		//
		//				if (dp[bit] == true) {
		//					for (int s = 0; s < n; s++) {
		//						if ((bit >> s & 1) == 0) {
		//							for (int k = s + 1; k < n; k++) {
		//								if ((bit >> k & 1) == 0) {
		//									if (canGet(bit, s, k)) {
		//										dp[bit + (1 << s) + (1 << k)] = true;
		//									}
		//								}
		//							}
		//						}
		//					}
		//				}
		//
		//			}
		//		}
		int len = 1 << n;
		for(int bit = 0; bit < len; bit++){
			if(dp[bit]){
				for (int s = 0; s < n; s++) {
					if ((bit >> s & 1) == 0) {
						for (int k = s + 1; k < n; k++) {
							if ((bit >> k & 1) == 0) {
								if (canGet(bit, s, k)) {
									dp[bit + (1 << s) + (1 << k)] = true;
								}
							}
						}
					}
				}	
			}
		}
		//printDP();

		printAns();
	}
	
	static void printDP(){
		for(boolean a : dp){
			System.out.print(a + " ");
		}
		System.out.println();
	}

	static void printAns() {
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i]) {
				// iの1の数を計算
				int count = 0;
				int k = i;
				for (int j = 0; j < n; j++) {
					if (((k & 1) == 1)) {
						count++;
					}
					k = k >> 1;
				}
				max = count > max ? count : max;
			}

		}

		System.out.println(max);
	}

	static void makeTable() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				//重なっていればtrue
				table[i][j] = d(x[i] - x[j]) + d(y[i] - y[j]) < d(r[i] + r[j]) ? true : false;
			}
		}
	}

	static int d(int a){
		return a*a;
	}

	static boolean canGet(int bit, int s, int k) {
		if (c[s] != c[k]) {
			return false;
		}

		for (int i = 0; i < n; i++) {
			if ((bit >> i & 1) == 0) {
				if (table[s][i] || table[k][i]) {
					return false;
				}
			}
		}

		return true;
	}

	static public boolean read() {
		n = sc.nextInt();
		if (n == 0) {
			return false;
		}

		on = new int[n][n];
		dp = new boolean[1 << n];
		//Arrays.fill(dp, false);
		table = new boolean[n][n];
		x = new int[n];
		y = new int[n];

		r = new int[n];
		c = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			r[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		return true;
	}

	public static void test(){
		int i = 16;
		System.out.println(i);
		System.out.println(i << 2);
		System.out.println(i);
	}
	
	public static void doIt(){
		while (read())
			solve();
	}

	public static void main(String args[]) {
		//test();
		doIt();
	}
}