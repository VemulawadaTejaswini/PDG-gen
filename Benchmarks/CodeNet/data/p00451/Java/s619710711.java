import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		while(in.hasNext()) {
			String str1=in.next(),str2=in.next();
			char CA1[]=str1.toCharArray(),CA2[]=str2.toCharArray();
			int dp[][]=new int[str1.length()][str2.length()];
			
			for(int i=0;i<str2.length();i++) {
				if(CA1[0]==CA2[i])dp[0][i]=1;
			}
			
			for(int i=0;i<str1.length();i++) {
				if(CA1[i]==CA2[0])dp[i][0]=1;
			}
			
			for(int i=1;i<str1.length();i++) {
				for(int j=1;j<str2.length();j++) {
					if(CA1[i]==CA2[j]) {
						dp[i][j]=dp[i-1][j-1]+1;
					}
					else dp[i][j]=dp[i-1][j];
				}
			}
			

			
			System.out.println(dp[str1.length()-1][str2.length()-1]);
		}
	}

}

