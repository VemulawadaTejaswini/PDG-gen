import java.util.ArrayList;
import java.util.Scanner;

// https://atcoder.jp/contests/abc081/tasks/abc081_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		int length = scanner.nextInt();

		// 値の取得
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<length;i++) {
			list.add(scanner.nextInt());
		}

		boolean flag = true;
		int count = 0;
		do{
			// 値が全て偶数かの確認（trueの時、全て偶数）
			for(int i=0;(i<length)&&flag;i++){
				if(list.get(i)%2!=0) {
					flag = false;
				}
			}

			if(flag) {
				// 偶数の時、全ての値を割る2した値に更新する。
				for(int j=0;(j<length);j++){
					list.set(j,list.get(j)/2);
				}
				// 偶数の時、操作回数を足す。
				count++;
			}
		}while(flag);

		System.out.println(count);

		scanner.close();

	}

}
