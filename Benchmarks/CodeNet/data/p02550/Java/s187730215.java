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
		int[] vis=new int[(int)M];
		long[] sum=new long[(int)M];
		Arrays.fill(vis, -1);
		int p=0;
		while (N-->0) {
			ans+=X;
			vis[(int)X]=p++;
			sum[(int)X]=ans;
			X=X*X%M;
			if (vis[(int)X]!=-1) {
				int T=p-vis[(int)X];
				ans+=N/T*(ans-sum[(int)X]+X);
				N%=T;
			}
		}
		System.out.println(ans);
	}
	
	void tr(Object...objects) {System.out.println(Arrays.deepToString(objects));}
}
