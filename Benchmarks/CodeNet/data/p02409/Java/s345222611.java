import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//渡される定数
		int num = sc.nextInt();//整数の数
		int n[][][] = new int[4][3][10];//配列

		//指定回数ループ
		for (int g = 0; g < num; g++) {
			int b = sc.nextInt();//b棟
			int f = sc.nextInt();//f階
			int r = sc.nextInt();//r番目の部屋
			int v = sc.nextInt();//v人追加

			n[b - 1][f - 1][r - 1] += v;

			//			//該当の棟bの為にh回ループ
			//			for (int h = 0; h < n.length; h++) {
			//
			//				//該当の階層fの為にi回ループ
			//				for (int i = 0; i < n.length; i++) {
			//
			//					//該当の部屋rの為にj回ループ
			//					for (int j = 0; j < n.length; j++) {
			//
			//						//上記から特定した区画にv人格納
			//
			//						n[b - 1][f - 1][r - 1] += v;
			//
			//					}
			//				}
		}
		//			System.out.println(n.length);
		//			System.out.println(n[0].length);
		//			System.out.println(n[0][0].length);

		//該当の棟bの為にh回ループ
		for (int h = 0; h < n.length; h++) {

			//一番最初の棟の列は＃を出力しない
			if (h != 0) {
				System.out.println("####################");
			}

			//該当の階層fの為にi回ループ
			for (int i = 0; i < n[0].length; i++) {

				//該当の部屋rの為にj回ループ
				for (int j = 0; j < n[0][0].length; j++) {
					System.out.print(" " + n[h][i][j]);

				}
				System.out.println();

			}

		}

	}
}
