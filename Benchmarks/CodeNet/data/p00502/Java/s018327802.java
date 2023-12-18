import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int day=sc.nextInt(),n=sc.nextInt();//入力
		int[] high=new int[day];
		for(int i=0;i<day;i++){
			high[i]=sc.nextInt();
		}
		int[] ht=new int[n];
		int[] lt=new int[n];
		int[] loud=new int[n];
		for(int i=0;i<n;i++){
			lt[i]=sc.nextInt();ht[i]=sc.nextInt();loud[i]=sc.nextInt();
		}//入力
		
		int[][] dp=new int[day][n];
		for(int i=0;i<day;i++){
			for(int j=0;j<n;j++){
				dp[i][j] = 0;
			}
		}
		int ans=0;
		for(int i=1;i<day;i++){
			for(int j=0;j<n;j++){
				if(lt[j]<=high[i]&&high[i]<=ht[j]);
				else continue;
				for(int k=0;k<n;k++){
					if(lt[k]<=high[i-1]&&high[i-1]<=ht[k]);
					else continue;
					dp[i][j]=Math.max(dp[i][j],Math.abs(loud[j]-loud[k]) + dp[i-1][k]);
					ans=Math.max(ans,dp[i][j]);
				}
			}	
		}	
		System.out.println(ans);
	}
}