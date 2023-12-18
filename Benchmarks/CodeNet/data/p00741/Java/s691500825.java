import java.util.Scanner;

public class Main {

	static boolean[][] map;
	static int[][] directions= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int ans = 0;
	static int[] nextSquare;
	static int w;
	static int h;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			 w = sc.nextInt();
			 h = sc.nextInt();

			if((w|h)==0) {
				break;
			}
			ans =0;

			map = new boolean[h][w];

			for(int i = 0; i < h; i++) {
				for(int j= 0; j < w; j++) {
					//陸ならtrue, 海ならfalse
					map[i][j] = (sc.nextInt() == 1);
				}
			}

			for(int i = 0; i < h; i++) {
				for(int j= 0; j < w; j++) {
					//左上から島を数える
					if(map[i][j]) {
						ans++;
						int[] nowSquare = {i,j};
						walkAround(nowSquare);
					};
				}
			}
			System.out.println(ans);
		}
	}

	static void walkAround(int[] nowSquare) {
		int nowH = nowSquare[0];
		int nowW = nowSquare[1];

		if(nowH <0 || nowH >= h || nowW < 0 || nowW >=w) {
			return;
		}

		if(map[nowH][nowW]==false) {
			return;
		}
		map[nowH][nowW] = false;
		for(int i = 0; i < 8; i++) {
			nextSquare = addArrayElms(nowSquare,directions[i]);
			walkAround(nextSquare);
		}


	}

	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}
}

