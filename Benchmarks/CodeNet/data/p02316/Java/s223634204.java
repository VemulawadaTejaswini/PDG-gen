import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=Integer.parseInt(in.next()),W=Integer.parseInt(in.next());
		List<mono> A=new ArrayList<>();

		int Lim=0;
		for(int i=0;i<N;i++) {
			mono m=new mono();
			m.v=Integer.parseInt(in.next()); m.w=Integer.parseInt(in.next());
			A.add(m);
		}


		int DP[]=new int[W+1];
		for(int i=0;i<N;i++) {
			mono m=A.get(i);
			for(int j=m.w;j<=W;j++) {
				DP[j]=Math.max(DP[j], DP[j-m.w]+m.v);
			}
		}

		int res=-1;
		for(int i=1;i<=W;i++)res=Math.max(res, DP[i]);
		System.out.println(res);
	}

}

class mono{
	int v=0,w=0;
}
