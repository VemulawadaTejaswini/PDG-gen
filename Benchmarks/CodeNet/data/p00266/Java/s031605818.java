import java.util.Scanner;

public class Main {

	static int N,R;
	static int[] a;
	static int[] fact=new int[100001];
	static long mod=1000000007;
	static{
		fact[0]=fact[1]=1;
		for(int i=2;i<fact.length;i++){
			fact[i]=factMod(i,1000000007);
		}
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);

		for(;;){
			N=cin.nextInt();
			if(N==0)break;
			SegmentTree tree=new SegmentTree(N+1);
			for(int i=0;i<N;i++){
				tree.update(i, 1);
			}
			R=cin.nextInt();
			long ans=0;
			a=new int[N+1];
			for(int i=0;i<N+1;i++){
				a[i]=i-1;
			}
			for(int i=0;i<R;i++){
				int x=cin.nextInt();
				int y=cin.nextInt();
				int tmp=a[x];
				a[x]=a[y];
				a[y]=tmp;
			}
			for(int i=1;i<N+1;i++){
//				System.out.println(i+" "+a[i]+" ");
//				ans=ans+(long)a[i]*(long)(fact[N-i]-bit.sum(a[i]));
				ans+=(long)fact[N-i]*tree.query(0,a[i],0,0,tree.n);
//				System.out.println(i+" "+a[i]+" ");
//				bit.add(a[i],1);
				tree.update(a[i], 0);
				ans%=mod;
				
//				System.out.println(ans);
			}
			System.out.println(ans);
		}
	}
	static int factMod(long n,long mod){
		
		return (int)((n%mod * fact[(int)n-1]%mod)%mod);
	}
	// 0-indexed
	static class SegmentTree {
		int a[];
		int n;
		public SegmentTree(int size) {
			for(n=1;n<size;) n <<= 1;
			a = new int[2*n];
		}
		void update(int k, int v) {
			k += n - 1;
			a[k] = v;
			for(;k>0;) {
				k = (k-1)/2;
				a[k] = a[k*2+1] + a[k*2+2];  // 記憶するデータ
			}
		}
		// [x, y)の最小値 : call as (x, y, 0, 0, n);
		int query(int x, int y, int k, int l, int r) {
			if(r <= x || y <= l) return 0;
			if(x <= l && r <= y) return a[k];
			int vl = query(x, y, k*2 + 1, l, (l+r)/2);
			int vr = query(x, y, k*2 + 2, (l+r)/2, r);
			return vl+ vr;
		}
	}

}