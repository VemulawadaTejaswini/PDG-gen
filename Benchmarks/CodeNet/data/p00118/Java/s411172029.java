import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	private static int H;
	private static int W;

	private static String[][] F ;
	private static boolean[][] State;

	public static void main(String args[]) throws IOException {
		Scanner scan = new Scanner(System.in);
		int Ans = 0;

		while(true) {
			String[] s = scan.nextLine().split(" +");
			Ans = 0;

			H = Integer.parseInt(s[0]);
			W = Integer.parseInt(s[1]);

			if(H == 0 && W == 0) {
				break;
			}

			F = new String[H][W];
			State = new boolean[H][W];

			for(int i = 0;i < H; i++) {
				String[] str = scan.nextLine().split("");
				F[i] = str;
				Arrays.fill(State[i], false);
			}

			for(int i = 0;i < H; i++) {
				for(int j = 0; j < W;j++) {
					if(!State[i][j]){
						State[i][j] = true;
						Fdiv(i,j);
						Ans++;
					}
				}
			}
			System.out.println(Ans);
		}
		scan.close();
	}

	private static int[][] st = {{-1,0},{0,1},{1,0},{0,-1}};

	private static void Fdiv(int y,int x) {
		for(int k = 0;k < 4;k++) {
			int xx = x + st[k][1];
			int yy = y + st[k][0];

			if(!(0 <= xx && xx < W && 0 <= yy && yy < H)) {
				continue;
			}

			if(!State[yy][xx] && F[y][x].equals(F[yy][xx])) {
				State[yy][xx] = true;
				Fdiv(yy,xx);
			}
		}
	}
}

