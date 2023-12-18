/**
 * 
 */
//package AtCoder;
import java.util.*;
/**
 * @author Shivansh Singh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,l1,l2,p;
		String str1,str2;
		str1=sc.next();
		str2=sc.next();
		l1=str1.length();
		l2=str2.length();
		int [][]dp=new int[l2+1][l1+1];
		for (i=0;i<=l1;i++)
			dp[0][i]=0;
		for (i=0;i<=l2;i++)
			dp[i][0]=0;
		for (i=1;i<=l2;i++) {
			for(j=1;j<=l1;j++) {
				if(str1.charAt(j-1)==str2.charAt(i-1))
					dp[i][j]=dp[i-1][j-1]+1;
				else
					dp[i][j]=(int)Math.max(dp[i-1][j],dp[i][j-1]);
			}
		}
		char []sub=new char[dp[l2][l1]];
		i=l2;
		j=l1;
		p=dp[l2][l1]-1;
		while(dp[i][j]!=0) {
			if(dp[i][j]==dp[i-1][j])
				i--;
			else if(dp[i][j]==dp[i][j-1])
				j--;
			else {
				sub[p]=str2.charAt(i-1);
				p--;
				i--;
				j--;
			}	
		}
		for (i=0;i<dp[l2][l1];i++)
			System.out.print(sub[i]);
		sc.close();
	}

}
