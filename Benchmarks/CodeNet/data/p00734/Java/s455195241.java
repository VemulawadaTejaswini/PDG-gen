import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int n = sc.nextInt();
			int m = sc.nextInt();

			if((n|m)==0) {
				break;
			}
			int[] taro = new int[n];
			int taroSum = 0;
			int[] hana = new int[m];
			int hanaSum =0;

			for(int i = 0; i < n; i++) {
				taro[i] = sc.nextInt();
				taroSum+=taro[i];
			}
			for(int i = 0; i < m; i++) {
				hana[i] = sc.nextInt();
				hanaSum +=hana[i];
			}

			int k = hanaSum - taroSum;
			boolean ok = false;

			int tAns =0;
			int hAns=0;

			if(k%2 == 0) {

				Arrays.sort(taro);

				for(int i = 0; i < n && ! ok; i++) {
					for(int j = 0; j < m && !ok; j++) {
						if(taro[i] + k/2 == hana[j]) {
							tAns =taro[i];
							hAns = hana[j];
							ok = true;
						}
					}
				}
			}
			if(ok) {
				System.out.println(tAns+" "+hAns);
			}else {
				System.out.println(-1);
			}
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

