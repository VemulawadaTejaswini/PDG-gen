import java.awt.*;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
class Main {
	
	static int x;
	static int y;
	static int z;
	
	
	static int[] v;
	static int[] n;
	static int[] e;
	static int[] A;
	
	static double[][][] memo;
	
	static double[] C;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			
			if(x == 0 && y == 0 && z == 0) break;
			int vmax = 0;
			v = new int[x];
			for(int i = 0; i < x; i++) {
				v[i] = sc.nextInt();
				vmax = Math.max(v[i], vmax);
			}
			
			n = new int[z];
			e = new int[z];
			A = new int[z];
			
			int sum = 0;
			
			for(int i = 0; i < z; i++) {
				n[i] = sc.nextInt();
				e[i] = sc.nextInt();
				A[i] = sc.nextInt();
				if(e[i] == 2) sum += A[i];
			}
			
			memo = new double[y+2 + vmax][sum+1][y+10];
			for(int i = 0; i < memo.length; i++) {
				for(int j = 0; j < memo[i].length; j++) {
					Arrays.fill(memo[i][j], 2 << 27);
				}
			}
			C = new double[y+10];
			double tmp = 1.0;
			C[0] = tmp;
			for(int i = 1; i < y+10; i++) {
				C[i] = tmp;
				tmp *= (1.0/x);
			}
			
			
			double ans = solv(0,0,1);
			
			System.out.println((int)ans);
			
		}
		
	}
	
	
	
	static double solv(int a, int b, int c) {
		if(memo[a][b][c] != 2 << 27) return memo[a][b][c];
		if(a >= y) {
			double ret = b * C[c];
			memo[a][b][c] = ret;
			return ret;
		}
		
		for(int i = 0; i < z; i++) {
			if(n[i] != a) continue;
			switch(e[i]) {
			case 1: a += A[i]; break;
			case 2: b += A[i]; break;
			case 3: b = Math.max(b - A[i], 0); break;
			}
		}
		
		if(a >= y) {
			double ret = b * C[c];
			memo[a][b][c] = ret;
			return ret;
		}
		
		double ret = 0;
		
		for(int i = 0; i < x; i++) {
			ret += solv(a + v[i],b,c+1);
		}
		memo[a][b][c] = ret;
		return ret;
		
	}
	
}