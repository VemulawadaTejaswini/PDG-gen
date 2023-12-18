import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), w = sc.nextInt();
		char[][] s = new char[h][w];
		int[] dx = new int[] {0,1,0,-1};
		int[] dy = new int[] {1,0,-1,0};
		for (int i = 0; i < h; i++) s[i] = sc.next().toCharArray();
		boolean alone = false;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if(s[i][j] == '#') {
					boolean flag = false;
					for (int k = 0; k < 4; k++) {
						if(i+dx[k]<h&&i+dx[k]>=0&&j+dy[k]<w&&j+dy[k]>=0) {
							flag = flag||(s[i+dx[k]][j+dy[k]]=='#');
						}
					}
					if(!flag) {
						alone = true;
						break;
					}
				}
			}
		}
		if(!alone)System.out.println("Yes");
		else System.out.println("No");
		sc.close();
	}
}