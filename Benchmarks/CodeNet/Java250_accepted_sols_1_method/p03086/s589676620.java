import java.util.*;
public class Main {

	/*
	 * 122B - 1st Solution
	 * 
	 * Idea is to try all substrings of string s
	 * Every substring is defined from character i to character j
	 * To check if a substring is AGCT is by keeping a boolean good and check whether or not any character has it
	 * If it's good then update the answer if the length of the substring is bigger
	 * The length of the substring is j - i + 1 (+1 because we include the i-th character
	 * 
	 * Time Complexity O(N^3), Memory Complexity O(N)
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		int ans = 0;
		for(int i = 0; i<N; i++) {
			for(int j = i; j<N; j++) {
				boolean good = true;
				for(int k = i; k<=j; k++) {
					if(s.charAt(k) != 'A' && s.charAt(k) != 'G' && s.charAt(k) != 'C' && s.charAt(k) != 'T') {
						good = false;
					}
				}
				if(good) {
					ans = Math.max(ans, j - i + 1);
				}
			}
		}
		System.out.println(ans);
	}
}
