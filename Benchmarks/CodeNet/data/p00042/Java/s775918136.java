
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int No=1;
		while(true) {
			int W=in.nextInt();
			if(W==0)break;
			
			int N=in.nextInt();
			List<Integer> va=new ArrayList<>(),wa=new ArrayList<>();
			for(int i=0;i<N;i++) {
				String str=in.next();
				String[] datas=str.split(",");
				va.add(Integer.parseInt(datas[0]));
				wa.add(Integer.parseInt(datas[1]));
			}
			
			int dp[][]=new int[N+1][W+1];
			
			for(int i=1;i<=N;i++) {
				int v=va.get(i-1),w=wa.get(i-1);
				for(int j=0;j<=W;j++) {
					dp[i][j]=dp[i-1][j];
					if(j-w>=0) {
						dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-w]+v);
					}
				}
			}
			
			int max=0,p=W+1;
			for(int i=W;i>=0;i--) {
				if(dp[N][i]>=max) {
					p=i;
					if(dp[N][i]>max)max=dp[N][i];
				}
			}
			
			System.out.printf("Case %d\n%d\n%d\n",No,max,p);
		}
	}

}

