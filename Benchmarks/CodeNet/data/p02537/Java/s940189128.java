
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static class SegTree{
		int dat[];
		int N;
		public SegTree(int N) {
			int v = 1;
			while(v < N){
				v *= 2;
			}
			this.N = v;
			dat = new int[v * 2];			
		}
		void update(int k , int a){
			k += N - 1;
			dat[k] = a;
			while(k > 0){
	            k = (k - 1) / 2;
	            dat[k] = Math.max(dat[k*2+1], dat[k*2+2]);				
			}
		}
	    int query(int a, int b) { return query(a, b, 0, 0, N); }
	    int query(int a, int b, int k, int l, int r) {
	        if(r <= a || b <= l) return 0;
	        if(a <= l && r <= b) return dat[k];
	        int m = (l + r) / 2;
	        return Math.max(query(a, b, k*2+1, l, m), query(a, b, k*2+2, m, r));
	    }		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int A[] = new int[N];
		int M = 0;
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
			M = Math.max(M, A[i]);
		}
		SegTree st = new SegTree(M + 1);
//		int dp[] = new int[M + 1];
		for(int a : A){
			int l = Math.max(0, a - K);
			int r = Math.min(M, a + K);
			int v = 1 + st.query(l, r + 1);
//			System.out.println(a+" "+v+" "+l+" "+r);
			st.update(a, v);
//			for(int i = 1 ; i <= M ; ++i){
//				System.out.println(i+" "+st.query(i, i));
//			}
//			System.out.println(Arrays.toString(st.dat));
		}
//		System.out.println(Arrays.toString(st.dat));
		System.out.println(st.query(0, M + 1));
	}
}
