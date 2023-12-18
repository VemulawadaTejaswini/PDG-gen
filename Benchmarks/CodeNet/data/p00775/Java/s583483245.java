import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static double ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int r = sc.nextInt();
			int n = sc.nextInt();

			if((n|r)==0) {
				break;
			}

			//[x軸][y軸]
			boolean[][] plusArea = new boolean[20][20];
			boolean[][] minusArea = new boolean[20][20];

			for(int i = 0;i<n ; i++) {
				int startX = sc.nextInt();
				int endX = sc.nextInt();
				int height = sc.nextInt();

			if(startX >= 0) {
				for(int h = 0;h<height ; h++) {
					for(int j = startX; j<endX; j++) {
						plusArea[j][h] = true;
					}
				}
			}else if (endX <= 0) {
				startX *= -1;
				endX *= -1;
				for(int h = 0;h<height ; h++) {
					for(int j = endX; j< startX; j++) {
						minusArea[j][h] = true;
					}
				}
			}else {
				startX *= -1;
				for(int h = 0;h<height ; h++) {
					for(int j = startX-1; j>=0; j--) {
						minusArea[j][h] = true;
					}
					for(int j = 0; j<endX; j++) {
						plusArea[j][h] = true;
					}
				}
			}
			}

			//x軸、y軸。象限両用
			double dist[][] = new double[20][20];

			for(int i = 0;i<20 ; i++) {
			Arrays.fill(dist[i], Double.MAX_VALUE);
			}

			//全ての升について必要になる時間を出す
			for(int i = 0;i<r ; i++) {
				for(int j = 0;j<20 ; j++) {

					if(i == 0) {
						dist[i][j] = j;
						continue;
					}else if(j==0) {
						dist[i][j] = j;
					}

					if(j == 0) {
						dist[i][j] = r-Math.sqrt(r*r-i*i);
						continue;
					}
					dist[i][j] = dist[i][j-1]+1;
				}
			}
			ans = 20;
			for(int i = 0;i<r ; i++) {
				for(int j = 0;j<20 ; j++) {
					if(!plusArea[i][j] || !minusArea[i][j]) {
						if(ans > dist[i][j]) {
							ans = dist[i][j];
						}
					}
				}
			}

			System.out.println(ans);

		}


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
