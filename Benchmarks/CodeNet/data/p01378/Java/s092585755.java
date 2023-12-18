import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] count = new int[] {1,5,10,50,100,500};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] in = sc.next().toCharArray();
		StringBuilder sbS = new StringBuilder();
		int id = 0;
		for(id = 0; id < in.length; id++) {
			if(in[id] == 'i') break;
			sbS.append(String.valueOf(in[id]));
		}
		String S = sbS.reverse().toString();
		id++;
		id++;
		id++;
		StringBuilder sbT = new StringBuilder();
		
		for(; id < in.length; id++) {
			sbT.append(String.valueOf(in[id]));
		}
		String T = sbT.toString();
		int[][] dp = new int[S.length()+1][T.length()+1];
		dp[0][0] = 3;
		for(int i = 0; i < S.length(); i++) {
			for(int j = 0; j < T.length(); j++) {
				//???????????¨
				for(int k = j; k < T.length(); k++) {
					char A = S.charAt(i);
					char B = T.charAt(k);
					
					boolean ret = check(A,B);
					dp[i+1][k] = Math.max(dp[i][j], dp[i+1][k]);
					dp[i+1][k+1] = Math.max(dp[i][j], dp[i+1][k+1]);
					if(!ret) {
						;
					}
					else {
						dp[i+1][k+1] = Math.max(dp[i][j]+2, dp[i+1][k+1]);
					}
				}
				//???????????¨
				for(int k = i; k < S.length(); k++) {
					char A = S.charAt(k);
					char B = T.charAt(j);
					boolean ret = check(A,B);
					dp[k][j+1]   = Math.max(dp[i][j], dp[k][j+1]);
					dp[k+1][j+1]   = Math.max(dp[i][j], dp[k+1][j+1]);
					if(!ret) {
						;
					}
					else {
						dp[k+1][j+1] = Math.max(dp[i][j]+2, dp[k+1][j+1]);
					}
				}
				dp[i+1][j+1] = Math.max(dp[i][j], dp[i+1][j+1]);
			}
		}
		int MAX = 0;
		for(int i = 0; i < dp.length; i++) {
			MAX = Math.max(MAX, dp[i][dp[0].length-1]);
		}
		for(int j = 0; j < dp[0].length; j++) {
			MAX = Math.max(MAX, dp[dp.length-1][j]);
		}
		System.out.println(MAX);
	}
	static boolean check(char A, char B) {
		if(A == '(' && B == ')') return true;
		if(A == ')' && B == '(') return true;
		if(A == '{' && B == '}') return true;
		if(A == '}' && B == '{') return true;
		if(A == '[' && B == ']') return true;
		if(A == ']' && B == '[') return true;
		return false;
	}
 }