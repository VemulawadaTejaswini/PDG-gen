
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int w, h, n, a, y, x;
		boolean ban[][];
		
		w = sc.nextInt();
		h = sc.nextInt();
		n = sc.nextInt();
		
		ban = new boolean[w][h];
		
		for(int i = 0; i < n; ++i) {
			x = sc.nextInt();
			y = sc.nextInt();
			a = sc.nextInt();
			if(a == 1) {
				for(int j = 0; j < x; ++j) {
					for(int k = 0; k < h; ++k) {
						ban[j][k] = true;
					}
				}
			}
			else if(a == 2) {
				for(int j = x; j < w; ++j) {
					for(int k = 0; k < h; ++k) {
						ban[j][k] = true;
					}
				}
			}
			else if(a == 3) {
				for(int j = 0; j < y; ++j) {
					for(int k = 0; k < w; ++k) {
						ban[k][j] = true;
					}
				}
			}
			else if(a == 4) {
				for(int j = y; j < h; ++j) {
					for(int k = 0; k < w; ++k) {
						ban[k][j] = true;
					}
				}
			}
		}
		
		int count = 0;
		
		for(int i = 0; i < w; ++i) {
			for(int j = 0; j < h; ++j) {
				if(ban[i][j] == false)++count;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
