import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
 * メモ
 * Scanner:nextは空白か改行までの単語
 * String[][] c = new String[h][w];
 * TemplateMain,"template_input.txt"
 * Deque deque = new ArrayDeque<String>();
 */

public class Main {
	
	public static void printlnYN(boolean b){
		if(b) System.out.println("Yes");
		else System.out.println("No");
	}

	public static void main(String[] args) throws IOException {
		
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
	    	int w = sc.nextInt();
	    	int h = sc.nextInt();
	    	if(w == 0 && h == 0) break;
	    	
	    	int[][] map = new int[h][w];
	    	for(int i = 0; i < h; i++) {
	    		for(int j = 0; j < w; j++) {
	    			String s = sc.next();
	    			if(s.equals("0")) map[i][j] = 0;
	    			else map[i][j] = 1;
	    		}
	    	}
	    	
	    	int count = 2;
	    	for(int i = 0; i < h; i++) {
	    		for(int j = 0; j < w; j++) {
	    			if(map[i][j] == 1) {
	    				map = find(map, h, w, count, i, j);
	    				count++;
	    			}
	    		}
	    	}
	    	
	    	
	    	System.out.println((count-2));
		}
    }
	
	public static int[][] find(int[][] map, int h, int w, int count, int s_y, int s_x) {
		Deque deque = new ArrayDeque<int[]>();
		int[] s = {s_y, s_x};
		map[s_y][s_x] = count;
		deque.addFirst(s);
		
		while(true) {
			int[] p = (int[])deque.pollFirst();
			
			if(p == null) break;
			
			int[] dy = {0, -1, -1, -1, 0, 1, 1, 1};
			int[] dx = {1, 1, 0, -1, -1, -1, 0, 1};
			int y = p[0];
			int x = p[1];
			
			for(int i = 0; i < 8; i++) {
				int next_y = y + dy[i];
				int next_x = x + dx[i];
				if(next_y >= 0 && next_y < h && next_x >= 0 && next_x < w) {
					if(map[next_y][next_x] == 1) {
						map[next_y][next_x] = count;
						int[] next_p = {next_y, next_x};
						deque.addFirst(next_p);
					}
				}
			}
		}
		
		return map;
	}
}
