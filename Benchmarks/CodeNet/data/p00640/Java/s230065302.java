import java.util.*;
import java.util.Map.Entry;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {	
	static char[] tank = new char[] {'^','>','v','<'};
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {-1,0,1,0};
	static final int INF = 2 << 28;
	static String str;
	static StringBuilder sb;
	static int ID;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int w = sc.nextInt();
			int h = sc.nextInt();
			Data data[] = new Data[n];
			HashMap<String,Integer> map = new HashMap<String,Integer>();
			for(int i = 0; i < n; i++) {
				String name = sc.next();
				map.put(name, i);
				int b = sc.nextInt();
				data[i] = new Data(name,b);
				for(int j = 0; j < b; j++) {
					int AA = sc.nextInt();
					int BB = sc.nextInt();
					int CC = sc.nextInt();
					int DD = sc.nextInt();
					String EE = sc.next();
					data[i].bt[j] = new BT(EE,AA,BB,CC,DD);
				}
			}
			
			int[] bf = new int[10000];
			
			bf[0] = 0;
			int ptr = 0;
			int up  = 0;
			
			int m = sc.nextInt();
			for(int i = 0; i < m; i++) {
				int N = bf[ptr];
				
				Data now = data[N];
				
				String in = sc.next();
				if(in.equals("click")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					for(int j = 0; j < now.bt.length; j++) {
						int x0 = now.bt[j].x0;
						int x1 = now.bt[j].x1;
						int y0 = now.bt[j].y0;
						int y1 = now.bt[j].y1;
						if(x0 <= x && x <= x1 && y0 <= y && y <= y1) {
							up = ++ptr;
							bf[ptr] = map.get(now.bt[j].name);
							break;
						}
					}
				}
				else if(in.equals("back")) {
					ptr = Math.max(0, ptr-1);
				}
				else if(in.equals("forward")) {
					ptr = Math.min(up, ptr+1);
				}
				else if(in.equals("show")) {
					System.out.println(now.name);
				}
			}
			
			
			
		}
	}
	static class Data {
		String name;
		BT bt[];
		Data(String a, int b) {
			name = a;
			bt = new BT[b];
		}
	}
	static class BT {
		String name;
		int x0;
		int y0;
		int x1;
		int y1;
		BT(String A, int a, int b, int c, int d) {
			name = A;
			x0 = a;
			y0 = b;
			x1 = c;
			y1 = d;
		}
	}
	
	
	
	
	
 }