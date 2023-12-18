import java.util.*;
import java.io.*;
import java.math.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int min = Integer.MAX_VALUE;
		for(int i = n; i >= 1; i--) {
			int[] y = new int[4];
			int[] x = new int[4];
			int[][] map = new int[(n/i) + ((n % i != 0)?1:0)][i];
			int nowx = 0;
			int nowy = 0;
			for(int j = 0; j < n; j++) {
				if(j+1 == a) {
					y[0] = nowy;
					x[0] = nowx;
				}
				if(j+1 == b) {
					y[1] = nowy;
					x[1] = nowx;
				}
				if(j+1 == c) {
					y[2] = nowy;
					x[2] = nowx;
				}
				if(j+1 == d) {
					y[3] = nowy;
					x[3] = nowx;
				}
				nowx++;
				if(nowx == i) {
					nowx = 0;
					nowy = nowy+1;
				}
			}
			min = Math.min(min, Math.abs(x[0] - x[1]) + Math.abs(y[0] - y[1]) + Math.abs(x[2] - x[3]) + Math.abs(y[2] - y[3]) );
			
			
			
			
			
		}
		System.out.println(min);
		
	}
}