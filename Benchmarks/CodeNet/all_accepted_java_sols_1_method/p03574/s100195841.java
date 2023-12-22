import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		int[] dx = {-1, -1, -1,  0, 0,  1, 1, 1};
		int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};
		
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '#') {
					System.out.print('#');
				} else {
					int cnt = 0;
					for (int idx = 0; idx < dx.length; idx++) {
						int x = j + dx[idx];
						int y = i + dy[idx];
						
						if (0 <= x && x < w && 0 <= y && y < h && s[y][x] == '#') {
							cnt++;
						}
					}
					
					System.out.print(cnt);
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}
}


