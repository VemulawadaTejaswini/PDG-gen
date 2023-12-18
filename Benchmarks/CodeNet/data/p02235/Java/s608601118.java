

import java.util.Scanner;

/*
 * Blake Miller
 * Longest Common Subsequence
 * AIZU 
 * 28 Sep 2018
 */
public class Main {
	static int lcs(String a, String b,int i, int j) {
		//based off yye lab instructions
		if (a.charAt(i) != b.charAt(j)) { //if not match
			if (i==0 && j==0) {
				return 0;
			}
			else if (i==0) {
				return(lcs(a,b,i, j-1));
			}
			else if (j==0) {
				return(lcs(a,b,i-1,j));
			}
			else if (i>0 && j>0) { //prevents out of bounds
				return (Math.max(lcs(a,b, i,j-1),
						lcs(a,b,i-1,j)));
			}
			else return 0;
		}
		else {
			if (i == 0 && j == 0) {
				return 1;
			}
			else if (i>0 && j>0) {
				return 1+(lcs(a,b,i-1,j-1));
			}
			else return 1;
		}
	}
	//Dynamic programming
	
	static int lcser(String a,String b) {
		int[][] d = new int[a.length()+1][b.length()+1]; //must be greater
		// the 1,1 position is the comparison between 0 of a and 0 of b
		for(int i=0; i<= a.length(); i++) {
			for (int j=0; j<= b.length(); j++) {
				d[i][j] = 0;
			}
		}
		for(int i=1; i <= a.length(); i++) {
			for(int j=1; j<=b.length(); j++) {
				if (a.charAt(i-1) != b.charAt(j-1)) {
					d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
				}
				else {
					d[i][j] = 1 + d[i-1][j-1];
				}
			}
		}
		return d[a.length()][b.length()];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int inputs = in.nextInt();
		String a;
		String b;
		for (int i = 0; i < inputs; i++) {
			a = in.next();
			b = in.next();
			System.out.println(lcser(a,b));
		}
	}
}

