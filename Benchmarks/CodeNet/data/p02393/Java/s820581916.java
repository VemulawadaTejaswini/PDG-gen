import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] sdata = input.split(" ");
		int[] idata = new int[3];
		boolean condition = true; // 入力された数値が条件範囲内かを確認するための変数
		int temp = 0; // 一時的にデータを保存しておく変数

		for (int i = 0; i < sdata.length; i++) {
			idata[i] = Integer.parseInt(sdata[i]);
			if (idata[i] <= 0 || idata[i] > 1000) {
				condition = false;
				break;
			}
		}

		if (condition) {
			for (int i = 0; i < idata.length - 1; i++) {
				for (int j = i + 1; j < idata.length; j++) {
					if (idata[j - 1] > idata[j]) {
						temp = idata[j];
						idata[j] = idata[j - 1];
						idata[j - 1] = temp;
					}
				}
			}

			for (int i = 0; i < idata.length; i++) {
				System.out.println(idata[i]);

			}
		}
	}

}

