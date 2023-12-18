import java.util.Scanner;

//Dividing Snacks
public class Main{

	class RMQ {
		int[] seg;
		int n;
		public RMQ(int N) {
			n = 1;
			while(n < N)n*=2;
			seg = new int[2*n];
			for(int i=0;i<2*n;i++){
				seg[i] = Integer.MAX_VALUE;
			}
		}
		//a[k] <- x
		void update(int k, int x){
			k += n - 1;
			seg[k] = x;
			while(k>0){
				k = (k-1)/2;
				seg[k] = Math.min(seg[2*k+1], seg[2*k+2]);
			}
		}
		//search min [a, b)
		//call by query(a, b, 0, 0, N)
		int query(int a, int b, int k, int l, int r){
			if(r<=a||b<=l)return Integer.MAX_VALUE;
			if(a<=l&&r<=b)return seg[k];
			int vl = query(a, b, k*2+1, l, (l+r)/2);
			int vr = query(a, b, k*2+2, (l+r)/2, r);
			return Math.min(vl, vr);
		}
	}
	
	int n, res;
	int[] a;
	RMQ rmq;
	
	void dfs(int k, int A, int B, int cost, boolean me){
		if(A==n/2 || B==n/2){
			res = Math.min(res, cost); return;
		}
		int max = res - cost, t = me?n/2-A:n/2-B;
		if(max<=rmq.query(k+1, k+t, 0, 0, n))return;
		for(int nx=k+t;k<nx;nx--){
			if(res<=cost+a[nx])continue;
			dfs(nx, A+(me?nx-k:0), B+(me?0:nx-k), cost+a[nx], !me);
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n];
		rmq = new RMQ(n);
		for(int i=1;i<n;i++){
			a[i] = sc.nextInt(); rmq.update(i, a[i]);
		}
		res = a[n/2];
		dfs(0, 0, 0, 0, true);
		System.out.println(res);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}