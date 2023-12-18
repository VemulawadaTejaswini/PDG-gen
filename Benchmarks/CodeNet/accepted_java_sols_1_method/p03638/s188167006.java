import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[][] s = new int[h][w];
		int indexH = 0;
		int indexW = -1;
		boolean odd = true;
		for (int i = 1; i <= n; i++) {
			int a = Integer.parseInt(sc.next());
			for (int j = 0; j < a; j++) {
				if (odd) {
					indexW++;
					if (indexW == w) {
						indexW--;
						indexH++;
						odd = false;
					}
				}
				else {
					indexW--;
					if (indexW < 0) {
						indexW++;
						indexH++;
						odd = true;
					}
				}
				s[indexH][indexW] = i;
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w - 1; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println(s[i][w - 1]);
		}
	}
}