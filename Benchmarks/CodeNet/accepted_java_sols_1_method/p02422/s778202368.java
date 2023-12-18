import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//対象文字列
		String str = sc.nextLine();

		//文字単位で配列に格納
		String[] str2 = str.split("");

		//命令の数
		int loop = sc.nextInt();

		for (int i = 0; i < loop; i++) {

			//命令の種類
			String command = sc.next();

			//種類ごとに与えられる変更範囲
			int a = sc.nextInt();
			int b = sc.nextInt();

			//命令がprintの時
			if (command.equals("print")) {
				for (int j = a; j <= b; j++) {//a-bを出力
					System.out.print(str2[j]);
				}
				System.out.print("\n");
			}

			//命令がreverseの時
			else if (command.equals("reverse")) {
				//a-bの外周から内側に向かって入れ替え
				for (int j = b, k = a; j > k; j--, k++) {
					String tmp="";
					tmp = str2[j];
					str2[j] = str2[k];
					str2[k] = tmp;

				}
			}

			//命令がreplaceの時
			else if (command.equals("replace")) {
				String rep = sc.next();//差し替え文字列の入力
				String[] rep2 = rep.split("");//差し替え文字を配列に分解
				int k = 0;//差し替え文字列用の配列位置の初期化
				for (int j = a; j <= b; j++) {
					str2[j] = rep2[k];//元配列を差し替え
					k++;//必要数になるまで増加
				}
			}
		}

		sc.close();
	}

}

