import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] list = new int [5];
//		int[] list = {29,20,7,35,120};
		//総和
		int sum = 0;
		//余剰時間
		int surplus = 0;
		//最低ロス時間
		int min = 0;


		for(int i = 0 ; i < 5 ; i++) {
			// 余剰時間を初期化
			surplus = 0;

			//Scannerで取ってきたものをlistに挿入
			list[i] = Integer.parseInt(sc.next());

			// listの総和を表す
			sum += list[i];

			// 下一桁を求め、差分を取って余剰時間を求める。
			if(list[i] / 100 != 0  && list[i] >= 100) {
				list[i] = list[i] % 100;

			}
			if(list[i] / 10 != 0 && list[i] >= 10) {
				list[i] = list[i] % 10;

			}
			if(list[i] != 0) {
				surplus = 10 -list[i];
//				System.out.println("C: " + surplus);
			}
			//余剰時間を総和に追加
			sum += surplus;
//			System.out.println("SUM: " + sum);


//			一番時短効果のある注文を特定する
			if(i == 0 && list[i] != 0) {
				min = list[i];
			}else if(list[i] < min && list[i] != 0) {
				min = list[i];
			}

		}
//		System.out.println("総和+余剰時間: " + sum);
// 時短ぶん引く
			if(min != 0) {
				sum = sum -(10 - min);
			}

		System.out.println(sum);

	}



}
