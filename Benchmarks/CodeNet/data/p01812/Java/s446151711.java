import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;
	static int[] D;
	static int[][] v;
	static int M;
	static int K;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();

		D = new int[N];
		int M2Dnum[] = new int[M];
		v = new int[N][K];

		Arrays.fill(D, -1);
		for(int i = 0; i < M; i++) {
			int d = sc.nextInt()-1;
			D[d] = i;
			M2Dnum[i] = d;
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j++) {
				v[i][j] = sc.nextInt()-1;
			}
		}

		//idxに示される状態になるための最小手数
		int[] minDist = new int[1 << M];
		Arrays.fill(minDist, Integer.MAX_VALUE);
		minDist[(1<<M)-1] =0;

		Queue<Integer> q= new ArrayDeque<Integer>();
		q.add((1<<M)-1);

		while(!q.isEmpty()) {
			int now = q.poll();


			//各指示
			for(int j = 0; j <K ; j++) {
				//or演算用
				int nextState = 0;
				//指示ごとに暗い部屋の次の行き先を調べる
				for(int i = 0; i < M; i++) {
					if((now  & (1 << D[M2Dnum[i]])) != 0 && D[v[M2Dnum[i]][j]] != -1) {
						nextState |= (1 <<  D[v[M2Dnum[i]][j]]);
					}
				}
				if(minDist[nextState] > minDist[now]+1) {
				minDist[nextState] = minDist[now]+1;
				q.add(nextState);
				}
			}
		}
		System.out.println(minDist[0]);
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

