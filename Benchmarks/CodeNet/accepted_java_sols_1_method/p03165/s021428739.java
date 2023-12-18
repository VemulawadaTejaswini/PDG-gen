import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a=scn.next();
		String b=scn.next();
		int[][] dp=new int[a.length()+1][b.length()+1];
		char[][] ss=new char[a.length()+1][b.length()+1];
		for(int i=0;i<=a.length();i++) {
			for(int j=0;j<=b.length();j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
					ss[i][j]='@';
					continue;
					
				}
				if(a.charAt(i-1)==b.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
					ss[i][j]='d';
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
					if(dp[i][j]==dp[i-1][j]) {
						ss[i][j]='u';
					}else {
						ss[i][j]='l';
					}
				}
					
				
				
			}
		}
		int len=dp[a.length()][b.length()];
		StringBuilder sb=new StringBuilder();
		int i=a.length();
		int j=b.length();
		while(sb.length()!=len) {
			if(ss[i][j]=='d') {
				sb.append(a.charAt(i-1));
				i=i-1;
				j=j-1;
			}else if(ss[i][j]=='u') {
				i=i-1;
				
			}else {
				j--;
			}
			
		}
		sb=sb.reverse();
		System.out.println(sb.toString());
		

	}

}
