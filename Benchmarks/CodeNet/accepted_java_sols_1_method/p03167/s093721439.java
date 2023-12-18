import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		char arr[][]=new char[m][n];
		String s="";
		for(int i=0;i<m;i++){
			s=sc.next();
			for(int j=0;j<n;j++){
				arr[i][j]=s.charAt(j);
			}
		}
		int dp[][]=new int[m][n];
		int i=0;
		while(i<m){
			if(arr[i][0]!='#'){
				dp[i][0]=1;
				i++;
			}
			else{
				while(i<m){
					dp[i][0]=0;
					i++;
				}
			}
		}
		i=0;
		while(i<n){
			if(arr[0][i]!='#'){
				dp[0][i]=1;
				i++;
			}
			else{
				while(i<n){
					dp[0][i]=0;
					i++;
				}
			}
		}
		for(int j=1;j<m;j++){
			for(int k=1;k<n;k++){
				if(arr[j][k]!='#'){
					dp[j][k]=(dp[j-1][k]+dp[j][k-1])%1000000007;
				}
				else{
					dp[j][k]=0;
				}
			}
		}
		System.out.println(dp[m-1][n-1]);
	}
}
