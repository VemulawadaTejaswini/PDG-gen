import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> valList = new ArrayList<>();

		// 標準入力（アンテナの座標）を取得する。
		for (int i = 0; i < 5; i++) {
			valList.add(scanner.nextInt());
		}
		//通信可能距離を取得する。
		int k = scanner.nextInt();

		scanner.close();

		boolean canCommuFlg = true;

		//拠点間の通信が可能かチェックする
		for (int i = 1; i < valList.size(); i++) {
			if(canCommuFlg == false) break;
			for (int j = 0; j < i; j++) {
				if (valList.get(i) - valList.get(j) > k) {
					canCommuFlg = false;
					break;
				}
			}
		}

		if (canCommuFlg == true) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}

}
