import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class Main {
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		int i;
		i=s.nextInt();
		s.nextLine();
		int[][] dp= new int[2][i];
				int[][] mat= new int[2][i];

		for(int n=0;n<2;n++){
			for(int j=0;j<i;j++){
				mat[n][j]=s.nextInt();
			}
			s.nextLine();
			
		}
		int i1=0;
		for(int j=0;j<i;j++){
			i1+=mat[0][j];
				dp[0][j]=i1;
			}
		i1=0;
		for(int j=0;j<i;j++){
			i1+=mat[1][i-j-1];
				dp[1][i-j-1]=i1;
			}
		int mx=0;
		for(int j=0;j<i;j++){
			if(dp[0][j]+dp[1][j]>mx)mx=dp[0][j]+dp[1][j];
			}
		System.out.println(mx);

	}
	
}