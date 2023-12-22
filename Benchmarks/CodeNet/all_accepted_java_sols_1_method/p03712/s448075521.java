import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = Integer.parseInt(sc.next());
		int W = Integer.parseInt(sc.next());
		String[][] a =new  String[H + 2][W + 2];
		for(int i = 0; i < W + 2; i++) {
			a[0][i] = "#";
		}
		System.out.println();
		for(int i = 1; i < H + 1; i++) {
			String tmp = sc.next();
			a[i][0] = "#";
			for(int j = 1; j < W + 1; j++) {
				a[i][j] = tmp.substring(j - 1, j);;
			}
			a[i][W + 1] = "#";
		}
		for(int i = 0; i < W + 2; i++) {
			a[H + 1][i] = "#";
		}
		sc.close();

		for(int i = 0; i < H + 2; i++) {
			for(int j = 0; j < W + 2; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}