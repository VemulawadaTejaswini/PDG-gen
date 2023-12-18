
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();


	public void run() {
		while(true){
			int W=sc.nextInt(),H=sc.nextInt();
			if(W==0 && H==0)return;

			int[] w=nextIntArray(W);
			int[] h=nextIntArray(H);

			int[] imosw=new int[W+1];
			for(int i=0;i<W;i++){
				imosw[i+1]=imosw[i]+w[i];
			}
			int[] imosh=new int[H+1];
			for(int i=0;i<H;i++){
				imosh[i+1]=imosh[i]+h[i];
			}

			int[] hc=new int[1500010];
			for(int f=0;f<=H;f++)for(int t=f+1;t<=H;t++){
				int hv=imosh[t]-imosh[f];
				hc[hv]++;
			}
			int[] wc=new int[1500010];
			for(int f=0;f<=W;f++)for(int t=f+1;t<=W;t++){
				int wv=imosw[t]-imosw[f];
				wc[wv]++;
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