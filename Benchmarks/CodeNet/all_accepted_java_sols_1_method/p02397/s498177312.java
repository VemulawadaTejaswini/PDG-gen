import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int Max = 3000;
		int[][] idata = new int[Max][2];
		String[] sdata = new String[2]; // 入力されたデータを半角区切りで分けて受け取るための配列
		String input = ""; // 入力されたデータを取る変数;
		int n = 0; // 入力されたデータの組数
		boolean inputjudge = true; // 入力された値が範囲内に収まっているかをチェックするための変数
		int temp = 0; // ２つの整数の順番を変える際に、片方の変数を一時的に格納しておくための変数

		for (int i = 0; i < idata.length; i++) {
			input = sc.nextLine();
			sdata = input.split(" ");
			if (sdata[0].equals("0") && sdata[1].equals("0")) {
				break;
			}
			idata[i][0] = Integer.parseInt(sdata[0]);
			idata[i][1] = Integer.parseInt(sdata[1]);

			if ((idata[i][0] >= 0 && idata[i][0] <= 10000)
					&& (idata[i][1] >= 0 && idata[i][1] <= 10000)) {
				n++; // 組数を1つカウントする
				if (idata[i][0] > idata[i][1]) { // 要素の順番を変更
					temp = idata[i][0];
					idata[i][0] = idata[i][1];
					idata[i][1] = temp;
				}
			} else {
				inputjudge = false;
				break;
			}

		}
		if (inputjudge == true) {

			for (int i = 0; i < n; i++) {
				System.out.println(idata[i][0] + " " + idata[i][1]);

			}
		}

	}

}

