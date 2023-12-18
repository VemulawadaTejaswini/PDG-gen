import java.io.*;
import java.util.*;

class Main {
	
	public static int[][] paper = new int[16][16];
	
	public static void small (int x, int y) {
		
		paper[y][x]++;
		paper[y - 1][x]++;
		paper[y + 1][x]++;
		paper[y][x - 1]++;
		paper[y][x + 1]++;
		
	}
	
	public static void middle (int x, int y) {
		
		small(x,y);
		paper[y - 1][x - 1]++;
		paper[y - 1][x + 1]++;
		paper[y + 1][x - 1]++;
		paper[y + 1][x + 1]++;
		
	}
	
	public static void big (int x, int y) {
		
		middle(x,y);
		paper[y - 2][x]++;
		paper[y + 2][x]++;
		paper[y][x - 2]++;
		paper[y][x + 2]++;
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			String s = br.readLine();
			if (s == null) break;
			StringTokenizer st = new StringTokenizer(s,",");
			int x = Integer.parseInt(st.nextToken()) + 3;
			int y = Integer.parseInt(st.nextToken()) + 3;
			int size = Integer.parseInt(st.nextToken());
			
			switch (size) {
				case 1 : small(x,y);  break;
				case 2 : middle(x,y); break;
				case 3 : big(x,y);    break;
			}
			
		}
		
		int max = 0;
		int cnt = 0;
		
		for (int i = 3; i < paper.length - 3; i++) {
			for (int j = 3; j < paper.length - 3; j++) {
				max = Math.max(max, paper[i][j]);
				if (paper[i][j] == 0) cnt++;
			}
		}
		System.out.printf("%d\n%d\n", cnt, max);
	}

}