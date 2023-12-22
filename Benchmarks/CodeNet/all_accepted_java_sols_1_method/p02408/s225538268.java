import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 所持しているカードの入力

		ArrayList<HashMap<String, String>> existCards = new ArrayList<>();

		for(int i=0; i<n; i++) {
			HashMap<String, String> card = new HashMap<>();
			card.put("mark", sc.next());
			card.put("rank", sc.next());
			existCards.add(card);
		}

		sc.close();

		// 抜けているカードを割り出す
		ArrayList<HashMap<String, String>> notExistsCards = new ArrayList<>();

		// １つづつカードを調べる
		String marks[] = {"S", "H", "C", "D"};
		for(String mark : marks) {
			for(int i=1; i<=13; i++) {
				HashMap<String, String> checkCard = new HashMap<>();
				checkCard.put("mark", mark);
				checkCard.put("rank", String.valueOf(i));
				if(existCards.indexOf(checkCard) == -1) {
					notExistsCards.add(checkCard);
				}
			}
		}

		// 出力
		for(HashMap<String, String> card : notExistsCards) {
			System.out.print(card.get("mark") + " " + card.get("rank") + "\n");
		}

	}

}
