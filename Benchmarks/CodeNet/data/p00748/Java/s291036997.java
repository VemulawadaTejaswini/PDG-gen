import java.awt.geom.*;
import java.util.*;
import static java.lang.Math.*;
public class Main{
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1167();
	}
	
	class AOJ1167{
		AOJ1167(){
			while(sc.hasNext()){
				int n=sc.nextInt();
				if(n==0)	break;
				solve(n);
			}
		}
		final int INF=1<<29;
		void solve(int n){
			final int MAX=1000000;
			int[]	a=new int[MAX+1],
					b=new int[MAX+1];
			for(int i=1,j=1; true; ++i){
				a[i]=i*(i+1)*(i+2)/6;
				if(a[i]%2==1)	b[j++]=a[i];
				if(a[i]>=MAX)	break;
			}
			
			int[] dp=new int[n+1];
			for(int i=0; i<=n; ++i)dp[i]=INF;
			dp[0]=0;
			for(int i=1; a[i]<=n; ++i){
				for(int j=0; j<=n; ++j){
					int tmp=j-a[i];
					if(tmp>=0){
						dp[j]=min(dp[j], dp[j-a[i]]+1);
					}
				}
			}
//			System.out.println(Arrays.toString(dp));
			System.out.print(dp[n]);
			
			for(int i=0; i<=n; ++i)dp[i]=INF;
			dp[0]=0;
			for(int i=1; b[i]<=n; ++i){
				for(int j=0; j<=n; ++j){
					int tmp=j-b[i];
					if(tmp>=0){
						dp[j]=min(dp[j], dp[j-b[i]]+1);
					}
				}
			}
//			System.out.println(Arrays.toString(dp));
			System.out.println(" "+dp[n]);
		}
	}
}