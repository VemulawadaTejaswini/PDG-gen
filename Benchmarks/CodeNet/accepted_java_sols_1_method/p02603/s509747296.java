import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt(); //N日

		ArrayList<Long> capital = new ArrayList<>();
		capital.add(1000L);
		capital.add(0L);
		//capital{現金,株}

		Map<Integer, Integer> stockPrice = new HashMap<Integer, Integer>();

		for(int i = 1; i <= N; i++) {
			stockPrice.put(i, sc.nextInt());
		}

		sc.close();

		for(int i = 1; i < N; i++) {
			//さいしゅうびまで
			if(stockPrice.get(i) < stockPrice.get(i+1) & capital.get(1) == 0) {
				//次の日に株価が上がって、かつ株を持ってない場合
				//株は買わないといけない(i日に)

				//株を買う操作
				long stock = capital.get(0) / stockPrice.get(i);
				long money = capital.get(0) % stockPrice.get(i);

				capital.set(0, money);
				capital.set(1, stock);

			}else if(stockPrice.get(i) > stockPrice.get(i+1) & capital.get(1) != 0) {
				//次の日に株価が下がって、かつ株を持ってる
				//株は全部売っていい(i日に)

				//株を売る操作
				long stockSellMoney = capital.get(1) * stockPrice.get(i);
				long money = capital.get(0);

				capital.set(0, money + stockSellMoney);
				capital.set(1, 0L);

			}
			//System.out.println(i + "日目 cash = " + capital.get(0) + " stock = " + capital.get(1));
		}

		//最終日まで上がり続けたときに売らないといけない
		if(capital.get(1) != 0) {
			//株持ってる
			//最終日に現金化
			long stockSellMoney = capital.get(1) * stockPrice.get(N);
			long money = capital.get(0);

			capital.set(0, money + stockSellMoney);
			capital.set(1, 0L);

		}

		//結果発表！！！
		System.out.println(capital.get(0));
	}



}
