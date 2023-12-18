import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, w, h, s, t;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			w = sc.nextInt(); h = sc.nextInt();
			boolean[][] map = new boolean[w][h];
			for (int i = 0; i < n; i++) 
				map[sc.nextInt()-1][sc.nextInt()-1] = true;
			s = sc.nextInt(); t = sc.nextInt();
			
			int count;
			int max = -1;
			for (int i = 0; i < w-s+1; i++) {
				count = 0;
				for (int k = i; k < i+s; k++) {
					for (int l = 0; l < t; l++) {
						if (map[k][l])
							count++;
					}
				}
				max = Math.max(max, count);
				for (int j = 1; j < h-t+1; j++) {
					for (int k = i; k < i+s; k++) {
						if (map[k][j-1]) count--;
						if (map[k][j+t-1]) count++;
					}
					max = Math.max(max, count);
				}
			}
			out.println(max);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}