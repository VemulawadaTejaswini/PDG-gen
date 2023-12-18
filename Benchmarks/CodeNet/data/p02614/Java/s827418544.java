import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int H;
	static int W;
	static int K;

	static boolean[][] c;

	public static void main(String[] args) throws IOException {
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		String W	 = in.readLine();
		//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		K = sc.nextInt();

		c  = new boolean[H][W];
		int blackNum = 0;

		for(int i = 0; i<H; i++) {
			String str = sc.next();
			for(int j = 0;j<W ; j++) {
				if(str.charAt(j)=='#') {
					blackNum++;

					c[i][j]=true;
				}
			}
		}

		ans =0;

		solve(new boolean[H+W], 0);


		System.out.println(ans);
	}



	static void solve(boolean[] lines, int idx) {
		if(idx == lines.length) {
			evaluate(lines);
			return;
		}else {
			lines[idx] = false;
			solve(lines, idx+1);
			lines[idx] = true;
			solve(lines, idx+1);
		}
		return;
	}

	static void evaluate(boolean[] lines) {
		boolean[][] tmp = new boolean[H][W];
		for(int i = 0;i<H ; i++) {
			for(int j = 0;j<W ; j++) {
				if(c[i][j]) {
					tmp[i][j]=true;
				}
			}
		}
		for(int i = 0;i<H ; i++) {
			if(lines[i]) {
				Arrays.fill(tmp[i], false);
			}
		}
		for(int i = H;i<W+H ; i++) {
			if(lines[i]) {
				for(int j = 0;j<H ; j++) {
					tmp[j][i-H] = false;
				}
			}
		}
		int tmpBlack = 0;
		for(int i = 0;i<H ; i++) {
			for(int j = 0;j<W ; j++) {
				if(tmp[i][j]) {
					tmpBlack++;
				}
			}
		}
		if(tmpBlack == K) {
			ans++;
		}
		return;
	}

	//BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

	//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}
}
