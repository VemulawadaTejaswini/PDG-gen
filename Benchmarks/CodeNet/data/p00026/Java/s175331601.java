import java.util.*;
import java.io.*;

import static java.util.Arrays.*;
import static javaa.String.Math.*;

public class Main {
	int INF = 1 << 28;
	double EPS = 1e-10;
	int OFS = 2;
	
	int[][] map;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		map = new int[10 + 4][10 + 4];
		for(;sc.hasNext(); ) {
			String[] ss = sc.next().split(",");
			int[] vals = new int[3];
			
			for(int i=0;i<3;i++) vals[i] = Integer.parseInt(ss[i]);
			if(val[2] == 1) small(val[0], val[1]);
			if(val[2] == 2) medium(val[0], val[1]);
			if(val[2] == 3) large(val[0], val[1]);
		}
		
		int sp = 0, max = 0;
		for(int x=2;x<10+2;x++) for(int y=2;y<10+2;y++) {
			if(map[y][x] != 0) max = max(max, map[y][x]);
			else sp++;
		}
		System.out.println(sp);
		System.out.println(max);
	}
	
	void large(int x, int y) {
		for(int ny=-2;ny<=2;ny++) {
			for(int nx=-( 2-abs(i) );nx<=2-abs(i);nx++) 
				map[y+ny+2][x+nx+2]++;
		}
	}
	
	void medium(int x, int y) {
		for(int i=-1;i<=1;i++) for(int j=-1;j<=1;j++) {
			map[y+j+2][x+i+2]++;
		}
	}
	
	void small(int x, int y) {
		map[y-1+2][x+2]++; map[y+2][x-1+2]++; map[y+1+2][x+2]++; map[y+2][x+1+2]++;
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}