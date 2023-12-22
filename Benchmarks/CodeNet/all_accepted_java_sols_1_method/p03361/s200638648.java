import java.util.Scanner;

public class Main {

	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];
		for(int i = 0; i < h ; i++) s[i] = sc.next().toCharArray();
		for(int i = 0 ; i < h ; i++) {
			for(int j = 0 ; j < w ; j++) {
				if(s[i][j] == '#') {
					int cnt = 0;
					for(int k = 0 ; k < 4 ; k++) {
						int nx = i + dx[k];
						int ny = j + dy[k];
						if(0 <= nx && nx < h && 0 <= ny && ny < w && s[nx][ny] == '#') {
							cnt++;
						}
					}
					if(cnt == 0) {
						System.out.println("No");
						return;
					}
				}
			}
		}
		System.out.println("Yes");
	}
}
