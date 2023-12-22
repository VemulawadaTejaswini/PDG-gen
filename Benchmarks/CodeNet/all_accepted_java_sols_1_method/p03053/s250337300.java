import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		Deque<int[]> deq = new ArrayDeque<>();
		
		boolean[][] a = new boolean[H][W];
		
		for(int i = 0; i < H; i++) {
			char[] s = sc.next().toCharArray();
			for(int j = 0; j < W; j++) {
				if(s[j] == '#') {
					int[] b = {i, j};
					deq.add(b);
					a[i][j] = true;
				}
			}
		}
		
		
		boolean check = true;
		int count = 0;
		
		while(check) {
			check = false;
			Deque<int[]> nextdeq = new ArrayDeque<>();
			while(!deq.isEmpty()) {
				int[] b = deq.poll();
				for(int i = 0; i < 4; i++) {
					int x = b[0] + dir[i][0];
					int y = b[1] + dir[i][1];
					if(x < 0 || x > H - 1 || y < 0 || y > W - 1 ) {
						continue;
					}
					if(a[x][y]) {
						continue;
					}
					a[x][y] = true;
					int[] c = {x, y};
					nextdeq.add(c);
					check = true;
				}
			}
			if(check) {
				count++;
			}
			deq = nextdeq;
		}
		System.out.println(count);
	}
}
