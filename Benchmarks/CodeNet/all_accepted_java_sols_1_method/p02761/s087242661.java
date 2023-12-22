//package abc157.C;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[] s = new int[m];
		int[] c = new int[m];
		
		for (int i = 0; i < m; i++) {
			s[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			if (n != 1 && s[i] == 1 && c[i] == 0) {
				System.out.println(-1);
				return;
			}
			for (int j = 0; j < i; j++) {
				if (s[i] == s[j] && c[i] != c[j]) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		for (int i = 0; i < 1000; i++) {
			String tmp = "" + i;
			if (tmp.length() != n) continue;
			boolean b = true;
			for (int j = 0; j < m; j++) {
				if (tmp.charAt(s[j] - 1) - '0' != c[j]) {
					b = false;
					break;
				}
			}
			if (b == false) continue;
			System.out.println(i);
			return;
		}
	}
	
}
