import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int[][] paper = new int[N][N];
		while(in.hasNext()) {
			String str = in.nextLine();
			String[] split = str.split(",");
			int x = Integer.parseInt(""+split[0]);
			int y = Integer.parseInt(""+split[1]);
			int s = Integer.parseInt(""+split[2]);

			switch (s) {
				case 1:
					fillSmall(paper, x, y);
					break;
				case 2:
					fillMid(paper, x, y);
					break;
				case 3:
					fillLarge(paper, x, y);
					break;
				default:
					if (!false) throw new AssertionError();
			}
		}

		int numOfZero = 0;
		int maxVal = 0;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(paper[i][j] == 0) {
					numOfZero++;
				}
				maxVal = Math.max(maxVal, paper[i][j]);
			}
		}
		System.out.println(numOfZero);
		System.out.println(maxVal);
	}

	public static boolean checkOk(int x, int y) {
		return (0 <= x && x < N && 0 <= y && y < N);
	}

	public static void fillSmall(int[][] paper, int cx, int cy) {
		int[] tx = {0,-1,0,1,0};
		int[] ty = {-1,0,0,0,1};
		for(int i=0;i<5;i++) {
			int x = cx + tx[i];
			int y = cy + ty[i];
			if(checkOk(x, y) == false) continue;
			paper[x][y] += 1;
		}
	}

	public static void fillMid(int[][] paper, int cx, int cy) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int x = (cx - 1) + j;
				int y = (cy - 1) + i;
				if(checkOk(x,y) == false) continue;
				paper[x][y] += 1;
			}
		}
	}

	public static void fillLarge(int[][] paper, int cx, int cy) {
		int[] tx =
			{0,
				-1,0,1,
				-2,-1,0,1,2,
				-1,0,1,
				0};
		int[] ty =
				{
						-2,
						-1,-1,-1,
						0,0,0,0,0,
						1,1,1,
						2
				};
		for(int i=0;i<13;i++) {
			int x = cx + tx[i];
			int y = cy + ty[i];
			if(checkOk(x,y) == false) continue;
			paper[x][y] += 1;
		}
	}
}