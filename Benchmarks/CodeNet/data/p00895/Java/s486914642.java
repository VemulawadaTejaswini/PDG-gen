import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		while (true) {
			int h = sc.nextInt(), w = sc.nextInt();
			if (h == 0 && w == 0) break;
			
			sc.nextLine();
			char[][] donut = new char[h][w];
			for (int i = 0; i < h; i++) {
				String s = sc.nextLine();
				for (int j = 0; j < w; j++)
					donut[i][j] = s.charAt(j);
			}
			
			String ans = "";
			
			Set<String> set = new HashSet<String>();
			
			int[] dx = {0, 0, 1, -1, 1, -1, 1, -1};
			int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					String s; 
					
					int k, l;
					for (int m = 0; m < 8; m++) {
						k = dx[m];
						l = dy[m];
						s = String.valueOf(donut[i][j]);
						while (k % h != 0 || l % w != 0) {
							s += String.valueOf(donut[(i+k+100*h)%h][(j+l+100*w)%w]);
							
							
							if (set.contains(s)) {
								if (ans.length() == 0 || ans.length() < s.length() || (ans.length() == s.length() && s.compareTo(ans) < 0))
									ans = s;
							} else {
								set.add(s);
							}
							k += dx[m];
							l += dy[m];
						}
					}
				}
			}
			if (ans.length() == 0)
				out.println(0);
			else
				out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}