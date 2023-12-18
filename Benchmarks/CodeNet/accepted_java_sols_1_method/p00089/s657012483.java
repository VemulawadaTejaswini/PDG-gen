import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n[][]=new int[100][];
		int i=0;
		while(sc.hasNext()){
			String s[]=sc.nextLine().split(",");
			int k=s.length;
			n[i]=new int[k];
			for(int j=0;j<k;j++)
				n[i][j]=Integer.parseInt(s[j]);
			i++;
		}
		int line=i;
		int dp[][]=new int[100][100];
		dp[0][0]=n[0][0];
		for(i=1;i<=line/2;i++){
			dp[i][0]=dp[i-1][0]+n[i][0];
			dp[i][i]=dp[i-1][i-1]+n[i][i];
			for(int j=1;j<n[i].length-1;j++){
				dp[i][j]=n[i][j]+Math.max(dp[i-1][j-1],dp[i-1][j]);
			}
		}
		for(;i<line;i++){
			for(int j=0;j<n[i].length;j++){
				dp[i][j]=n[i][j]+Math.max(dp[i-1][j],dp[i-1][j+1]);
			}
		}
		System.out.println(dp[line-1][0]);
	}
}
