import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = sc.next().toCharArray();
		}
		
		boolean[] rmRow = new boolean[h];
		boolean[] rmClm = new boolean[w];
		
		outer:
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') continue outer; 
			}
			rmRow[i] = true;
		}
		
		outer:
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (a[j][i] == '#') continue outer; 
			}
			rmClm[i] = true;
		}
		
		for (int i = 0; i < h; i++) {
			if (rmRow[i]) continue;
			for (int j = 0; j < w; j++) {
				if (rmClm[j]) continue;
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}


