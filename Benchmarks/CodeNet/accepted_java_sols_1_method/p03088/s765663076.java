

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		long dp[][][][]=new long[110][5][5][5];
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
			if(n==1)System.out.println(4);
			else if(n==2)System.out.println(16);
			else {
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						for(int k=0;k<4;k++)
						{
							dp[3][i][j][k]=1;
						}
					}
				}
				//AGCT
				dp[3][0][1][2]=0;
				dp[3][1][0][2]=0;
				dp[3][0][2][1]=0;
				long mod=1000000000+7;
				for(int cur=4;cur<=n;cur++)
				{
					for(int i=0;i<4;i++)
					{
						for(int j=0;j<4;j++)
						{
							for(int k=0;k<4;k++)
							{
								for(int l=0;l<4;l++)
								{
									
									if(j==0 && k==1 && l==2)continue;
									if(j==1 && k==0 && l==2)continue;
									if(j==0 && k==2 && l==1)continue;
									if(i==0 && j!=0 && k==1 && l==2)continue;
									if(i==0 && j==1 && k!=2 && l==2)continue;
									dp[cur][j][k][l]+=dp[cur-1][i][j][k];
									dp[cur][j][k][l]%=mod;
								}
							}
						}
					}
				}
				long sum=0;
				for(int i=0;i<4;i++)
				{
					for(int j=0;j<4;j++)
					{
						for(int k=0;k<4;k++)
						{
							sum+=dp[n][i][j][k];
							sum%=mod;
						}
					}
				}
				System.out.println(sum);
			}
		}
		
	
}
