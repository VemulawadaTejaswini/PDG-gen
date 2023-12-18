import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int inf=100000000;//とにかく大きい数
				
				int n=sc.nextInt();//圧縮する入力信号の数
				int m=sc.nextInt();//コードブックに含まれる値の個数
				if(n+m==0) break;
				int[] c=new int[m+1];//コードブックの値
				int[] x=new int[n+1];//入力信号の値
				for(int i=0; i<m; i++) {
					c[i]=sc.nextInt();
				}
				for(int i=0; i<n; i++) {
					x[i]=sc.nextInt();
				}
				
				int[][] dp=new int[n+1][256];
				for(int i=0; i<256; i++) {
					for(int j=0; j<=n; j++) {
						dp[j][i]=inf;
					}
				}
				dp[0][128]=0;
				ArrayList<Integer> list=new ArrayList<>();
				for(int i=0; i<n; i++) {
					for(int j=0; j<256; j++) {
						if(dp[i][j]==inf) {
							continue;
						}
						for(int k=0; k<m; k++) {
							int yn=j+c[k];
							if(yn>255) yn=255;
							else if(yn<0) yn=0;
							int sum=(x[i]-yn)*(x[i]-yn);
							dp[i+1][yn]=Math.min(dp[i+1][yn], dp[i][j]+sum);
							//System.out.println("dp["+(i+1)+"]["+yn+"]="+dp[i+1][yn]);
						}
					}
				}
				
				for(int j=0; j<256; j++) {
					if(dp[n][j]!=inf) {
						list.add(dp[n][j]);
					}
				}
				Collections.sort(list);
				System.out.println(list.get(0));
				
			}


		}
	}
}
