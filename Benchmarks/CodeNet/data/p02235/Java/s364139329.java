import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	HashMap<String, Integer> cache = new HashMap<String, Integer>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfPairs;
		numberOfPairs = input.nextInt();
		for(int i = 0; i < numberOfPairs; i++) {
			String firstString = input.next();
			String secondString = input.next();
			System.out.println(findLCS(firstString, secondString));
		}
		input.close();

	}
	
	static int findLCS(String s0, String s1) {
		int[][] table = new int[s0.length() + 1][s1.length() + 1];
		for(int i = 1; i < s0.length() + 1; i++) {
			for(int j = 1; j < s1.length() + 1; j++) {
				if(s0.charAt(i - 1) == s1.charAt(j - 1)) {
					table[i][j] = 1 + table[i - 1][j - 1];
				}
				else {
					table[i][j] = Math.max(table[i - 1][j], table[i][j - 1]);
				}
			}
			
		}
		return table[s0.length()][s1.length()];
		/* 
		 * Recursive Solution
		 * int length;
		if(cache.containsKey(s0 + "," + s1)) {
			return cache.get(s0 + "," + s1);
		}
		else if(cache.containsKey(s1 + "," + s0)) {
			return cache.get(s1 + "," + s0);
		}
		
		if(s0.isEmpty() || s1.isEmpty()) {
			length = 0;
			return length;
		}
		
		if(s0.charAt(0) == s1.charAt(0)) {
			length = 1 + findLCS(s0.substring(1), s1.substring(1));
			cache.put(s0 + "," + s1, length);
			return length;
		}
		else {
			length = Math.max(findLCS(s0.substring(1), s1), findLCS(s0, s1.substring(1)));
			return length;
			
		}
		*/
	}

}
