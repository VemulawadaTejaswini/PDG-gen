
// Submitted By Subhash Yadav
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.*;

public class Main {

	static int h, w;
	static char board[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String first[] = br.readLine().split(" ");
		h = Integer.parseInt(first[0]);
		w = Integer.parseInt(first[1]);

		String strt[] = br.readLine().split(" ");
		int sx = Integer.parseInt(strt[0])-1, sy = Integer.parseInt(strt[1])-1;

		String end[] = br.readLine().split(" ");
		int ex = Integer.parseInt(end[0])-1, ey = Integer.parseInt(end[1])-1;
		board =new char[h][w];
		for (int i = 0; i < h; i++) {
			char c[] = br.readLine().toCharArray();
			for (int j = 0; j < w; j++)
				board[i][j] = c[j];
		}
		br.close();

		ArrayDeque<Integer> ax = new ArrayDeque<>(), ay = new ArrayDeque<>();
		ax.add(sx);
		ay.add(sy);

		int dis[][] = new int[h][w];
		for (int i = 0; i < h; i++)
			Arrays.fill(dis[i], Integer.MAX_VALUE);
		dis[sx][sy] = 0;
		int row[] = { -1, 0, 0,1};
		int col[] = { 0, -1, 1, 0 };

		while (!ax.isEmpty()) {
			int getx = ax.removeFirst(), gety = ay.removeFirst();

			for (int d = 0; d < 4; d++) {
				int newx = getx + row[d], newy = gety + col[d];
				if (!legal(newx, newy))
					continue;

				if (dis[newx][newy] > dis[getx][gety]) {
					dis[newx][newy] = dis[getx][gety];
					ax.addFirst(newx);
					ay.addFirst(newy);
				}

			}
			
			// show the magic
			
			for(int x1=getx-2;x1<=getx+2;x1++) {
				for(int y1=gety-2;y1<=gety+2;y1++) {
					if(!legal(x1, y1)) continue;
					if (dis[x1][y1] > dis[getx][gety]+1) {
						dis[x1][y1] = dis[getx][gety]+1;
						ax.addLast(x1);
						ay.addLast(y1);
					}
					
				}
			}
			

		}

		System.out.println(dis[ex][ey] != Integer.MAX_VALUE ? dis[ex][ey] : -1);

	}

	public static boolean legal(int x, int y) {
		return x >= 0 && x < h && y >= 0 && y < w && board[x][y] == '.';
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}