import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[] s = new String[h];
		for(int i = 0; i < h; i++) {
			s[i] = sc.next();
		}
		int[] dx = {0,0,1,1,1,-1,-1,-1};
		int[] dy = {-1,1,-1,0,1,-1,0,1};
		for(int i = 0; i < h; i++) {
			for(int j = 0; j< w; j++) {
				if(s[i].charAt(j)=='.') {
					int count = 0;
					for(int k = 0; k < 8; k++) {
						int x = i+dx[k];
						int y = j+dy[k];
						if((x>=0 && x < h) && (y>=0 && y < w)) {
							if(s[x].charAt(y)=='#') {
								count++;
							}
						}
					}
					System.out.print(count);
				}
				else {
					System.out.print('#');
				}
			}
			System.out.println();
		}
	}
}