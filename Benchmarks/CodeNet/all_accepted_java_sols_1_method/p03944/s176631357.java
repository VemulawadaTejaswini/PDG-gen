import java.util.*;
public class Main {

	public static void main(String[] args) {
		/*
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int N = stdIn.nextInt();
		boolean[][] P = new boolean[W][H];
		
		for(int i = 0; i < N; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int a = stdIn.nextInt();
			if(a == 1) {
				for(int j = 0; j < x; j++) {
					Arrays.fill(P[j], true);
				}
			}
			else if(a == 2) {
				for(int j = x; j < W; j++) {
					Arrays.fill(P[j], true);
				}
			}
			else if(a == 3) {
				for(int j = 0; j < y; j++) {
					for(int k = 0; k < W; k++) {
						P[k][j] = true;
					}
				}
			}
			else if(a == 4) {
				for(int j = y; j < H; j++) {
					for(int k = 0; k < W; k++) {
						P[k][j] = true;
					}
				}
			}
		}
		
		int ans = 0;
		for(int i = 0; i < W; i++) {
			for(int j = 0; j < H; j++) {
				if(!P[i][j]) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		*/
		
		Scanner stdIn = new Scanner(System.in);
		int W = stdIn.nextInt();
		int H = stdIn.nextInt();
		int N = stdIn.nextInt();
		int x0 = 0;
		int y0 = 0;
		
		for(int i = 0; i < N; i++) {
			int x = stdIn.nextInt();
			int y = stdIn.nextInt();
			int a = stdIn.nextInt();
			if(a == 1) {
				if(x > x0 && x < W) {
					x0 = x;
				}
				else if(x >= W) {
					System.out.println(0);
					System.exit(0);
				}
			}
			else if(a == 2) {
				if(x < W && x > x0) {
					W = x;
				}
				else if(x <= x0) {
					System.out.println(0);
					System.exit(0);
				}
			}
			else if(a == 3) {
				if(y > y0 && y < H) {
					y0 = y;
				}
				else if(y >= H) {
					System.out.println(0);
					System.exit(0);
				}
			}
			else if(a == 4) {
				if(y < H) {
					H = y;
				}
				else if(y <= y0) {
					System.out.println(0);
					System.exit(0);
				}
			}
		}
		
		System.out.println((W-x0)*(H-y0));

	}

}