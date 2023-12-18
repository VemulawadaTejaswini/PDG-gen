import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for(int i = 1; i <= s.length(); i++){
		    for(int j = 1; j <= t.length(); j++){
		        if(s.charAt(i-1) == t.charAt(j-1)){
		            dp[i][j] = dp[i - 1][j - 1] + 1;
		        }else{
		            dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
		        }
		    }
		}
		int a = s.length();
		int b = t.length();
		StringBuilder ans = new StringBuilder();
		while(a > 0 && b > 0){
		    if(s.charAt(a - 1) == t.charAt(b - 1)){
		        ans.append(s.charAt(a - 1));
		        a--;
		        b--;
		    }else if(dp[a - 1][b] >= dp[a][b - 1]){
		        a--;
		    }else{
		        b--;
		    }
		}
		System.out.println(ans.reverse());
	}

}
