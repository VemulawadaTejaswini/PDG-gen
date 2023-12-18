

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = Integer.parseInt(sc.next());
		
		int []c = new int [26];
		int [][]s = new int[d][26];
		
		for(int i = 0 ; i < 26 ;i++) {
			c[i] = Integer.parseInt(sc.next());
		}
		
		for(int i = 0; i < d ;i++) {
			for(int j = 0 ; j < 26 ; j++) {
				s[i][j] = Integer.parseInt(sc.next());
			}
		}
		int []p = new int [d];
		
		for(int i = 0 ;i < d ;i++) {
			p[i] = Integer.parseInt(sc.next());
		}
		long []ans = new long [d+1];
		int []r = new int [26];
		
		for(int i = 0 ; i < d ; i++) {
			ans[i+1] = ans[i] + (long)s[i][p[i]-1];
			r[p[i]-1] = i+1;
			for(int j = 0 ; j < 26 ;j++) {
					 ans[i+1] -= (long)c[j]*(i+1 - r[j]);
				 
			}
		}
		
		for(int i = 1 ; i <= d ;i++) {
			System.out.println(ans[i]);
		}

		

	}

}
