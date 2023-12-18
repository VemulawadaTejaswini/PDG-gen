import java.util.Arrays;

//Darts
public class Main{

	void run(){
		Scanner sc = new Scanner();
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			int[] p = new int[n+1];
			for(int i=0;i<n;i++)p[i]=sc.nextInt();
			int[] a = new int[n*n];
			int N = 0;
			for(int i=0;i<=n;i++)for(int j=0;j<=i;j++)if(p[i]+p[j]<=m)a[N++]=p[i]+p[j];
			Arrays.sort(a);
//			debug(a);
//			int d = m-a[1];
//			int l = 0;
//			int r = a.length-1;
//			debug(r);
//			while(r-l>1){
//				int mid = (l+r)/2;
//				if(a[mid]<=d)l=mid;
//				else r=mid;
//			}
//			System.out.println("L:"+l+" R:"+r);
			int max = 0;
			int s = 0;
			int t = a.length-1;
			while(s<=t){
				if(max==m)break;
				if(a[s]+a[t]<=m){
					max=Math.max(max, a[s]+a[t]);
					s++;
				}
				else t--;
			}
			System.out.println(max);
		}
	}
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	class Scanner {
		int nextInt() {
			try {
				int c = System.in.read();
				while (c != '-' && (c < '0' || '9' < c))
					c = System.in.read();
				if (c == '-') return -nextInt();
				int res = 0;
				do {
					res *= 10;
					res += c - '0';
					c = System.in.read();
				} while ('0' <= c && c <= '9');
				return res;
			} catch (Exception e) {
				return -1;
			}
		}
	}	
	public static void main(String[] args) {
		new Main().run();
	}
}