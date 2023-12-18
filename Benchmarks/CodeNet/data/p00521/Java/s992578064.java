import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		char[][] map = new char[m][];
		for(int i = 0; i < m; i++ ) {
			map[i] = sc.next().toCharArray();
		}
		String A = sc.next();
		String B = sc.next();
		char A1 = A.charAt(0);
		char A2 = A.charAt(1);
		char B1 = B.charAt(0);
		char B2 = B.charAt(1);
		int ck = 0;
		int[][] count = new int[m][n];
		for(int i = 0; i < m-1; i++) {
			for(int j = 0; j < n-1; j++) {
				char a1 = map[i][j];
				char a2 = map[i][j+1];
				char b1 = map[i+1][j];
				char b2 = map[i+1][j+1];
				int cunt = 0;
				if(a1 == A1) cunt++;
				if(a2 == A2) cunt++;
				if(b1 == B1) cunt++;
				if(b2 == B2) cunt++;
				if(cunt == 4) {
					count[i][j]--;
					count[i][j+1]--;
					count[i+1][j]--;
					count[i+1][j+1]--;
					ck++;
				}
				else if(cunt == 3) {
					if(a1 != A1) {
						count[i][j]++;
					}
					else if(a2 != A2) {
						count[i][j+1]++;
					}
					else if(b1 != B1) {
						count[i+1][j]++;
					}
					else {
						count[i+1][j+1]++;
					}
				}
			}
		}
		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				max = Math.max(count[i][j], max);
			}
		}
		System.out.println(ck + max);
		
		
	}
}