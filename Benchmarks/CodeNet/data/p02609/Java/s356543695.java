import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] parent;//union-find用
	static int[] rank;//union-find用
	static long[][] modNums;
	static long modSumPlus;
	static long modSumMinus;
	static boolean[] originX;
	static int originPop;

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();
		originX = new boolean[N];
		originPop = 0;

		for(int i = N-1;i>=0 ; i--) {
			if(X.charAt(i)==49) {
				originX[i]=true;
				originPop++;
			}
		}

		boolean[] Xi;
		int radix = 1;
		modNums = new long[2][N];
		modSumPlus = 0;
		modSumMinus = 0;

		//全ての桁について、pop+の時とpop-の時を予め全て調べる
		for(int i = originX.length-1; i>=0; i--) {
			//plus版
			modNums[0][i] = radix%(originPop + 1);
			if(originX[i]) {
				modSumPlus+=modNums[0][i];
				modSumPlus%=(originPop+1);
			}
			//minus版
			if(originPop>1 && originX[i]) {
				modNums[1][i] = radix%(originPop-1);
				modSumMinus += modNums[1][i];
				modSumMinus%=(originPop-1);
			}
			radix*=2;
		}

		//1つ1つのiについて答えを出す
		for(int i = 0; i<N; i++) {
			Xi= originX.clone();

			Xi[i]=!Xi[i];
			System.out.println(solve(i));
		}
	}

	static long solve(int i) {
		long mod = 0;
		if(originX[i]) {
			//i番目のbitが0になった場合
			mod = modSumMinus - modNums[1][i];
			mod %= (originPop-1);
		}else {
			//i番目のbitが1になった場合
			mod= modSumPlus + modNums[0][i];
			mod%=(originPop+1);
		}

		if(mod==0) {
			return 1L;
		}else {
			return longSolve(Math.abs(mod), 2);
		}
	}

	static long longSolve(long mod, int idx) {
		mod = mod%Long.bitCount(mod);
		if(mod == 0) {
			return idx;
		}else {
			return longSolve(Math.abs(mod), idx+1);
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

	//Union-Find用の配列を要素数nで初期化
	static void ufInit(int n){
		parent = new int[n];
		rank = new int[n];
	}

	//Union-Findの要素の最上位の親（グループ名）を返す
	static int ufFind(int a) {
		if(parent[a]==a) {
			return a;
		}else {
			return ufFind(parent[a]);
		}
	}

	//Union-Find木を連結する
	static void ufUnite(int a, int b) {
		a = parent[a];
		b = parent[b];

		if(a==b) {
			return;
		}
		if(rank[a] > rank[b]){
			parent[b]=a;
		}else {
			parent[a]=b;
			if(rank[a]==rank[b]) {
				rank[b]++;
			}
		}
	}

	static boolean ufSame(int a, int b) {
		return ufFind(a)==ufFind(b);
	}
}
