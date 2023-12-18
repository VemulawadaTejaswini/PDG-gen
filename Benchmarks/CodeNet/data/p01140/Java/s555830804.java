import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		int[] hc=new int[1500010];
		int[] wc=new int[1500010];
		while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;

			int[] w=nextIntArray(W);
			int[] h=nextIntArray(H);

			Arrays.fill(hc,0);
			Arrays.fill(wc,0);

			for(int i=0;i<H;i++){
				int s = 0;
				for(int j=i;j<H;j++){
					s+=h[j];
					hc[s]++;
				}
			}
			for(int i=0;i<W;i++){
				int s = 0;
				for(int j=i;j<W;j++){
					s+=w[j];
					wc[s]++;
				}
			}

			int res=0;
			for(int i=1;i<1500010;i++){
				res+=hc[i]*wc[i];
			}

			ln(res);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	public int[] nextIntArray(int n){
		int[] res=new int[n];
		for(int i=0;i<n;i++){
			res[i]=sc.nextInt();
		}
		return res;
	}
	public static void pr(Object o) {
		out.print(o);
	}
	public static void ln(Object o) {
		out.println(o);
	}
	public static void ln() {
		out.println();
	}
}