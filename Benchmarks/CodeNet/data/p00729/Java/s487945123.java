
import java.util.*;

import static java.lang.System.*;

class Main {
	public static Scanner sc = new Scanner(in);
	public static Random rand=new Random();

	public void run() {
		while(true){
			int N=sc.nextInt(),M=sc.nextInt();
			if(N==0)break;
			int r=sc.nextInt();

			int[][] imos=new int[M][1400];
			for(int i=0;i<r;i++){
				int t=sc.nextInt(),n=sc.nextInt(),m=sc.nextInt()-1,s=sc.nextInt();

				if(s==1){
					imos[m][t]=1;
				}else{
					imos[m][t]=-1;
				}
			}

			int q=sc.nextInt();
			for(int i=0;i<q;i++){
				int ts=sc.nextInt(),te=sc.nextInt(),m=sc.nextInt()-1;
				int time=0,l=0;

				for(int t=0;t<ts;t++){
					l+=imos[m][t];
				}
				for(int t=ts;t<te;t++){
					l+=imos[m][t];
					if(l>0)time++;
				}
				ln(time);
			}
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