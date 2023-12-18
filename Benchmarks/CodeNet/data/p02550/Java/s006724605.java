import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] $) {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		long N=sc.nextLong();
		long X=sc.nextLong();
		long M=sc.nextLong();
		long ans=0;
		long[][] pre=new long[(int)M][2];
		for (int i=0;i<M;++i) for (int j=0;j<2;++j) pre[i][j]=-1;
		for (long i=0;i<N;++i) {
			ans+=X;
			if (pre[(int)X][0]!=-1) {
				long period=i-pre[(int)X][0];
				long sum=ans-pre[(int)X][1];
				long res=N-1-i;
				ans+=res/period*sum;
				i+=res/period*period;
			}
			pre[(int)X][0]=i;
			pre[(int)X][1]=ans;
			X=X*X%M;
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
