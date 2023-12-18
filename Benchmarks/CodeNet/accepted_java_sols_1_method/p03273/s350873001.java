
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = Integer.parseInt(scan.next());
		int W = Integer.parseInt(scan.next());
		char[][] a = new char[H][W];
		String str;
		for (int i = 0; i < H; i++) {
			str = scan.next();
			for (int j = 0; j < W; j++) {
				a[i][j] = str.charAt(j);
			}
		}
		boolean allWhite;
		//行の探索
		for (int i = 0; i < H; i++) {
			allWhite = true;
			for (int j = 0; j < W; j++) {
				if (a[i][j] == '#') {
					allWhite = false;
					break;
				}
			}
			if (allWhite) {
				for (int j = 0; j < W; j++) {
					a[i][j] = '_';
				}
			}
		}
		//列の探索
		for (int j = 0; j < W; j++) {
			allWhite = true;
			for (int i = 0; i < H; i++) {
				if (a[i][j] == '#') {
					allWhite = false;
					break;
				}
			}
			if (allWhite) {
				for (int i = 0; i < H; i++) {
					a[i][j] = '_';
				}
			}
		}
		//解の出力
		boolean allBlank;
		for (int i = 0; i < H; i++) {
			allBlank = true;
			for (int j = 0; j < W; j++) {
				if (a[i][j] != '_') {
					System.out.print(a[i][j]);
					allBlank=false;
				}
			}
			if (!allBlank) {
				System.out.println();
			}
		}
	}
}
