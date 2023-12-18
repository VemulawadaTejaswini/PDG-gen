import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//2次元配列の生成
		String[][] c = new String[3][3];
		for(int i = 0; i < 3; i++) {
			String tmp = sc.next();
			for(int j = 0; j < 3; j++) {
				c[i][j] = tmp.substring(j, j + 1);
			}
		}
		sc.close();

		//3文字を出力
		System.out.println(c[0][0] + c[1][1] + c[2][2]);

	}
}