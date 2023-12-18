import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine(), s2=br.readLine();
		int[]c1=new int[s1.length()], c2=new int[s2.length()];
		for(int i=0;i<s1.length();i++)c1[i]=s1.charAt(i);
		for(int i=0;i<s2.length();i++)c2[i]=s2.charAt(i);
		int[][]dp=new int[s1.length()][s2.length()];
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(c1[i]==c2[j]){
					dp[i][j]=1;
					if(i*j!=0)dp[i][j]=dp[i-1][j-1]+dp[i][j];
				}else{
					if(i==0&&j==0)continue;
					else if(i!=0&&(j==0||dp[i-1][j]>dp[i][j-1]))dp[i][j]=dp[i-1][j];
					else dp[i][j]=dp[i][j-1];
				}
			}
		}
		String ans="";
		int cr=s1.length()-1, cc=s2.length()-1;
		while(cr>-1&&cc>-1){
			if(c1[cr]==c2[cc]){
				ans=(char)c1[cr]+ans;
				cr--;
				cc--;
			}else if(cr!=0&&(cc==0||dp[cr-1][cc]>dp[cr][cc-1]))cr--;
			else cc--;
		}
		System.out.println(ans);
	}
}
