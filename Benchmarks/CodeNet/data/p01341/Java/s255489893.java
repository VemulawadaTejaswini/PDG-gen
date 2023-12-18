import java.util.Scanner;

public class Main {
	int[] par;
//	union-findの木の初期化
	void unionfindInit(int n){
		for(int i = 0;i < n;i++) {
			par[i] = i;
		}
		for (int i:par) {
			System.out.println(i);
		}
	}
//	木の根を求める
	int unionfindRoot(int x) {
		if(par[x]==x) {
			return x;
		}
		else {
			return par[x] = unionfindRoot(par[x]);
		}
	}
//	xとyが同じ集合に属するか否か
	boolean unionfindSame(int x, int y) {
		return unionfindRoot(x) == unionfindRoot(y);
	}
	
//	xとyの属する集合を併合
	void unionfinUnite(int x, int y) {
		x = unionfindRoot(x);
		y = unionfindRoot(y);
		if (x == y) return;
//		System.out.println("befo" + par[x]);
		par[x]=y;
//		System.out.println("after" + par[x]);
	}
	void run(){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		par = new int[N+1];
		int M = scan.nextInt();
		int coordinate[][] = new int[N+1][2];
		int x, y;
		int p, q;
		int fence[][] = new int[M][2];
		double hen1, hen2;
		double[] hypotenuse = new double[M]; //パイル間の距離
//		釘の座標情報
		for(int i=1; i< N+1;i++) {
			x = scan.nextInt();
			y = scan.nextInt();
			coordinate[i][0] = x;
			coordinate[i][1] = y;
		}
//		フェンスの情報
		unionfindInit(N+1);
		for(int i=0; i < M; i++) {
			p = scan.nextInt();
			q = scan.nextInt();
			fence[i][0] = p;
			fence[i][1] = q;
			hen1 = Math.abs(coordinate[p][0] - coordinate[q][0]);
			hen2 = Math.abs(coordinate[p][1] - coordinate[q][1]);
			hypotenuse[i] = Math.sqrt(hen1*hen1+hen2*hen2);
		}
//		大きい順にソート
		double tmp;
		int tmp2, tmp3;
		for(int i = 0; i< M; i++) {
			for(int j = 0; j < M;j++) {
				if(hypotenuse[i] > hypotenuse[j]) {
					tmp = hypotenuse[i];
					hypotenuse[i] = hypotenuse[j];
					hypotenuse[j] = tmp;
					tmp2 = fence[i][0];
					tmp3 = fence[j][0];
					fence[i][0] = fence[i][1];
					fence[j][0] = fence[j][1];
					fence[i][1] = tmp2;
					fence[j][1] = tmp3;
				}
			}
		}
		double sum = 0;
		for(int i=0; i < M;i++) {
			if (!unionfindSame(par[fence[i][0]], par[fence[i][1]])) {
				unionfinUnite(par[fence[i][0]], par[fence[i][1]]);
			}
			else {
				sum += hypotenuse[i];
			}
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

