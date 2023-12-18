import java.util.Scanner;

public class Main {
	static int[][] t;
	static int[][] u;
	static int n;
	public static void main (String[] args) {
		int N =300;
		t = new int[N+1][N+1];
		u = new int[N+1][N+1];
		Scanner scan = new Scanner(System.in);
		n =scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				t[i][j] = scan.nextInt();
			u[i][j]=t[i][j]+u[i-1][j]+u[i][j-1]-u[i-1][j-1];
			}
		}
		int ans=-10000;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				if(ans > calc(i,j))
					ans= calc(i,j);	
			}
		}
	}
	
	static int sum(int ai,int aj,int bi,int bj){
		  ai--;
		  aj--;
		  return u[bi][bj]-u[ai][bj]-u[bi][aj]+u[ai][aj];
	}
	
	static int calc(int ah,int bh){
		int res=-100000;
		int maxm=0;
		for(int i=1;i<=n;i++){
			if (res < maxm+sum(ah,i,bh,i)) {
				res = maxm+sum(ah,i,bh,i);
			}
			int d=t[ah][i]+t[bh][i];
			if(ah==bh)d/=2;
			if( maxm + d < sum(ah,i,bh,i) ) {
				maxm=sum(ah,i,bh,i);
			}
		}
		return res;
		}
	
}