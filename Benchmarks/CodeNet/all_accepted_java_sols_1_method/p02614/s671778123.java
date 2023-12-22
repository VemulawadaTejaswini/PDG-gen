
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		char [][]grid = new char[h][w];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				grid[i][j] = s.charAt(j);
			}
		}
		
		int ans = 0;
		
		for(int i = 0 ; i < Math.pow(2,h) ; i++) {
			for(int j = 0 ; j < Math.pow(2, w) ; j++) {
				int cnt = 0;
				for(int y = 0 ; y < h ;y++) {
					for(int x = 0 ; x < w ;x++) {
						if(((i>>y)&1)== 1 || ((j>>x)&1)== 1) {
							continue;
						}
						if(grid[y][x] == '#') {
							cnt++;
						}
					}
				}
				if(k == cnt) {
					ans++;
				}
			}
		}
		
		System.out.println(ans);
		
		
	}
}
