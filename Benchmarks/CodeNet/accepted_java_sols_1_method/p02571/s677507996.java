

import java.util.Scanner;

public class Main {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		String s = in.next();
		String t = in.next();
		
		int n = s.length();
		int m = t.length();
		
		int ans = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			if (i+m-1>=n) break;
			int diff = 0;
			for(int j=0; j<m; j++) {
				if (t.charAt(j)!=s.charAt(i+j)) diff++;
			}
			ans = Math.min(ans, diff);
		}
		
		System.out.println(ans);
		
		

	}

}
