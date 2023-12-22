import java.util.*;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String str[]=new String[100];
		int k=0;
		for(k=0;sc.hasNext();k++)str[k] = sc.next();

		String data[][]=new String[k][100];
		for(int i=0;i<k;i++)
			data[i] = str[i].split(",");  
		int table[][]=new int[k][k];
		for(int i=0;i<(k+1)/2;i++){
			for(int j=0;j<data[i].length;j++){
				table[i-j][j]=Integer.parseInt(data[i][j]);
			}
		}
		int cnt=1;
		for(int i=(k+1)/2;i<k;i++){
			for(int j=0;j<data[i].length;j++){
				table[i-j-cnt][j+cnt]=Integer.parseInt(data[i][j]);
			}
			cnt++;
		}
		
		int dp[][]=new int[k][k];
		for(int i=0;i<k;i++){
			for(int j=0;j<k;j++){
				if(i==0&&j==0)dp[i][j]=table[i][j];
				else if(i==0)dp[i][j]=table[i][j]+dp[i][j-1];
				else if(j==0)dp[i][j]=table[i][j]+dp[i-1][j];
				else if(dp[i-1][j]>=dp[i][j-1]){
					dp[i][j]=table[i][j]+dp[i-1][j];
				}else if(dp[i-1][j]<dp[i][j-1]){
					dp[i][j]=table[i][j]+dp[i][j-1];
				}
				//System.out.println(dp[i][j]);
			}
		}
		System.out.println(dp[k-1][k-1]);
		
		
		


	}
}