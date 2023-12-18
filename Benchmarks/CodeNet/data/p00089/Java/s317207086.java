import java.util.*;
class Main{
	public static void main(String args[]){
		int table[][]=new int[100][100];
		int dp[][]=new int[100][100];
		Scanner s=new Scanner(System.in);
		int count=0;
		for(int i=0;i<100;i++)
			for(int j=0;j<100;j++)
				table[i][j]=dp[i][j]=0;
		
		while(s.hasNext()){
			String str=s.next();
			String[] dat=str.split(",");
			for(int i=0;i<dat.length;i++){
				table[count][i]=Integer.parseInt(dat[i]);
			}
			count++;
		}
		dp[0][0]=table[0][0];
		for(int i=1;i<count;i++){
			for(int j=0;j<count;j++){
				if(i<count/2){
					if(j==0)dp[i][j]=dp[i-1][j]+table[i][j];
					else dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1])+table[i][j];
				}else{
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j+1])+table[i][j];
				}
			}
		}
		System.out.println(dp[count-1][0]);
	}
}