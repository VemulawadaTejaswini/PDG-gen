import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] parent;//union-find用
	static int[] rank;//union-find用


	static int[][] pp = new int[4][2];
	//pp:0 pm: 1 mp:2 mm:3

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] xy = new int[N][2];
		for(int i = 0;i<4 ; i++) {
			Arrays.fill(pp[i], -1);
		}

		for(int i = 0;i<N ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xy[i][0]=x;
			xy[i][1]=y;
			update(x, y);
		}

		ans = 0;
		for(int i = 0;i<3 ; i++) {
			if(pp[i][0]==-1) {
				continue;
			}
			for(int j = i;j<4 ; j++) {
				if(pp[j][0]==-1) {
					continue;
				}
				ans = Math.max(ans, Math.abs(pp[i][0]-pp[j][0])+Math.abs(pp[i][1]-pp[j][1]));
			}
		}


		System.out.println(ans);
	}

	public static void update(int x, int y) {
		int[] xy = {x, y};
		int a = 0;
		int b = 0;
		if(pp[0][0]+pp[0][1] <x+y || pp[0][0]==-1) {
			a = pp[0][0];
			b = pp[0][1];
			pp[0] = xy;
			if(a == -1) {
				return;
			}
			update(a, b);
		}else
		if(pp[1][0]-pp[1][1] < x-y|| pp[1][0]==-1) {
			a = pp[1][0];
			b = pp[1][1];
			pp[1] = xy;
			if(a == -1) {
				return;
			}
			update(a, b);
		}else
		if(pp[2][0]*-1 + pp[2][1] < x*-1+y|| pp[2][0]==-1) {
			a = pp[2][0];
			b = pp[2][1];
			pp[2] = xy;
			if(a == -1) {
				return;
			}
			update(a, b);
		}else
		if(pp[3][0]*-1 + pp[3][1]*-1 < (x+y)*-1|| pp[3][0]==-1) {
			a = pp[3][0];
			b = pp[3][1];
			pp[3] = xy;
			if(a == -1) {
				return;
			}

			update(a, b);
		}
		return;
	}

	//素数判定
	public static boolean isPrime(long num) {
		if (num < 2) return false;
		else if (num == 2) return true;
		else if (num % 2 == 0) return false; // 偶数はあらかじめ除く

		double sqrtNum = Math.sqrt(num);
		for (int i = 3; i <= sqrtNum; i += 2)
		{
			if (num % i == 0)
			{
				// 素数ではない
				return false;
			}
		}

		// 素数である
		return true;
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
