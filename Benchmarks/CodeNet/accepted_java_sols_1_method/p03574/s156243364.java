/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] cnt = new int[n][m];
		char[][] arr = new char[n][m];
	
		
		for(int i = 0; i < n; ++i) {
			char[] tmp = in.next().toCharArray();
			for(int j = 0; j < m; ++j) {
				arr[i][j] = tmp[j];
				
				if(tmp[j] == '#') {
					if(i > 0) ++cnt[i - 1][j];
					if(j > 0) ++ cnt[i][j - 1];
					if(i < n - 1) ++cnt[i + 1][j];
					if(j < m - 1) ++cnt[i][j + 1];
					if(i > 0 && j > 0) ++cnt[i - 1][j - 1];
					if(i > 0 && j < m - 1) ++cnt[i - 1][j + 1];
					if(i < n - 1 && j > 0 ) ++cnt[i + 1][j - 1];
					if(i < n - 1 && j < m - 1) ++cnt[i + 1][j + 1];
				}
			}
		}
		
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				if(arr[i][j] == '#') System.out.print("#");
				else System.out.print(cnt[i][j]);
			} System.out.println();
		}
		
	}
}