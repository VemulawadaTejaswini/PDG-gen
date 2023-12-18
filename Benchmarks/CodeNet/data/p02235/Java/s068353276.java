//package lab9;

import java.util.Scanner;

public class Main {
	
	
	static /*
	 * 3 (= q sequences)
	 * abcbdab
	 * bdcaba
	 * abc
	 * 
	 * (q*2 subsequences)
	 * abc
	 * abc
	 * bc
	 */
	
	int subsequence(String one, String two) {
		int[][] LCS = new int[one.length()][two.length()];
		
		for(int j = 0; j < two.length()-1; j++) {
			LCS[0][j] = 0;
		}
		for(int i = 0; i < one.length()-1; i++) {
			LCS[i][0] = 0;
		}
		
		for(int i = 1; i <= one.length()-1; i++) {
			for(int j = 1; j <= two.length()-1; j++) {
				
				if(one.charAt(i-1) != two.charAt(j-1)) {
					LCS[i][j] = Math.max(LCS[i-1][j], LCS[i][j-1]);
				} else {
					LCS[i][j] = 1 + LCS[i-1][j-1];
				}
			}
		}
		
		return LCS[one.length()-1][two.length()-1];
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int q = in.nextInt();
		in.nextLine();
		for(int i = 0; i < q; i++) {
			String one = in.nextLine();
			one += " ";
			String two = in.nextLine();
			two += " ";
			//System.out.println(one);
			//System.out.println(two);
			System.out.println(subsequence(one, two));
		}
		
		
	}
}

