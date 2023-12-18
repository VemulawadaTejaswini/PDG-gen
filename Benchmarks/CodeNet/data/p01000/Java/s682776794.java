import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	static int[] vx = new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1, 0, 0, 0, 0, 0, 0 ,0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};
	static int[] vy = new int[] {-1,-1,-1, 0, 0, 0, 1, 1, 1,-1,-1,-1, 0, 0, 1, 1, 1,-1,-1,-1, 0, 0, 0, 1, 1, 1};
	static int[] vz = new int[] {-1, 0, 1,-1, 0 ,1,-1, 0, 1,-1, 0, 1,-1, 1,-1, 0, 1,-1, 0, 1,-1, 0 ,1,-1, 0, 1};
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseX = 1;
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			boolean[][][] state = new boolean[5][5][5];
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					String in = sc.next();
					for(int k = 0; k < 5; k++) {
						if(in.charAt(k) == '1') state[i][j][k] = true;
					}
				}
			}
			int m1 = sc.nextInt();
			int[] a = new int[m1];
			for(int i = 0; i < m1; i++) {
				a[i] = sc.nextInt();
			}
			int m2 = sc.nextInt();
			int[] b = new int[m2];
			for(int i = 0; i < m2; i++) {
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			for(int day = 0; day < n; day++) {
				int[][][] count = new int[5][5][5];
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						for(int k = 0; k < 5; k++) {
							for(int l = 0; l < vx.length; l++) {
								int tx = i + vx[l];
								int ty = j + vy[l];
								int tz = k + vz[l];
								if(!rangeCheck(tx,ty,tz)) continue;
								count[i][j][k] += state[tx][ty][tz]?1:0;
							}
						}
					}
				}
				for(int i = 0; i < 5; i++) {
					for(int j = 0; j < 5; j++) {
						for(int k = 0; k < 5; k++) {
							int tmp = count[i][j][k];
							if(state[i][j][k]) {
								if(Arrays.binarySearch(b, tmp) < 0) state[i][j][k] = false;
							}
							else {
								if(Arrays.binarySearch(a, tmp) >= 0) state[i][j][k] = true;
							}
						}
					}
				}
			}	
			if(caseX != 1) System.out.println();
			System.out.println("Case " + caseX++ + ":");
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					for(int k = 0; k < 5; k++) {
						System.out.print(state[i][j][k]?"1":"0");
					}
					System.out.println();
				}
				if(i != 4)
				System.out.println();
			}
		}
	}
	static boolean rangeCheck(int a, int b, int c) {
		if(a < 0 || b < 0 || c < 0 || a >= 5 || b >= 5 || c >= 5) return false;
		return true;
	}
 }