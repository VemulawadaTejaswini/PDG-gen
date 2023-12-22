import java.util.*;
public class Main {

	/*
	 * 122B - 2nd Solution
	 * 
	 * For every right end point of a substring, we try to find the farthest left end point 
	 * Done so by having a loop to control the right end point 
	 * And then start going away from the right end point one by one
	 * The first if statement is that if the j-th character is not part of ACGT then we can just stop there because going any further won't produce an AGCT string
	 * The else if statement just means that if all the letters before the right end point (including itself) is part of AGCT then [0 ... i] is a possible AGCT string
	 * 
	 * Time Complexity O(N^2), Memory Complexity O(N)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		int ans = 0;
		for(int i = 0; i<N; i++) {
			for(int j = i; j>=0; j--) {
				if(s.charAt(j) != 'A' && s.charAt(j) != 'C' && s.charAt(j) != 'G' && s.charAt(j) != 'T') {
					ans = Math.max(ans, i - j);
					break;
				}
				else if(j == 0) {
					ans = Math.max(ans, i+1);
				}
			}
		}
		System.out.println(ans);
	}
}
