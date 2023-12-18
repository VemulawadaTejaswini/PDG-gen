import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),M[]=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			if(i==0) {
				M[i++]=in.nextInt();
				M[i]=in.nextInt();
			}
			else {
				in.nextInt();
				M[i]=in.nextInt();
			}
		}
		
		int DP[][]=new int [n+1][n+1];
		for(int i=1;i<=n;i++) {
			for(int j=1;i+j<=n;j++)DP[j][i+j]=Integer.MAX_VALUE;
		}
		
		
		for(int i=1;i<n;i++) {
			for(int j=1;i+j<=n;j++) {
				if(i==1) {
					DP[j][i+j]=M[j-1]*M[j]*M[i+j];
					continue;
				}
				for(int k=j;k<i+j;k++) {
					int v=DP[j][k]+DP[k+1][i+j]+(M[j-1]*M[k]*M[i+j]);
					DP[j][i+j]=Math.min(DP[j][i+j], v);
				}
			}
		}
		System.out.println(DP[1][n]);
	}

}

