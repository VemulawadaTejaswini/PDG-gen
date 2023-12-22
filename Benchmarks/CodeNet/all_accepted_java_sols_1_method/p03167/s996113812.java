//package compilers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);

		int n=in.nextInt();
		int m=in.nextInt();
		int arr[][]=new int [n][m];
		int mod=(int)1e9+7;
		for(int i=0;i<n;i++) {
			String s=in.next();
			for(int j=0;j<m;j++) {
				if(i==0 && j==0)
					arr[i][j]=1;
				else if(i==0) {
					if(s.charAt(j)=='#')
						arr[i][j]=0;
					else arr[i][j]=arr[i][j-1];
				}
				else if(j==0) {
					if(s.charAt(j)=='#')
						arr[i][j]=0;
					else arr[i][j]=arr[i-1][j];
				}
				else {
					if(s.charAt(j)=='#')
						arr[i][j]=0;
					/*
					 * else if(arr[i-1][j]==0 && arr[i][j-1]==0) arr[i][j]=0;
					 */
					/*
					 * else if(arr[i][j-1]==0) arr[i][j]=1;
					 */
					else arr[i][j]=(arr[i-1][j]%mod+ arr[i][j-1]%mod)%mod;
				}
				
					 
			}
		}
		System.out.println(arr[n-1][m-1]);
	}

}
