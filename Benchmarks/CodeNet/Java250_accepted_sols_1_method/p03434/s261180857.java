import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int inputDeckNum = sc.nextInt();
		ArrayList<Integer> deckList = new ArrayList<>();
		for(int i=1;i <= inputDeckNum;i++) {
			deckList.add(sc.nextInt());
		}

		Collections.sort(deckList, Collections.reverseOrder());

		int first_player = 0;
		int second_player = 0;

		for(int i = 0;i < deckList.size();i++) {
			if(i % 2 == 0) {
				first_player += deckList.get(i);
			}else{
				second_player += deckList.get(i);
			}
		}

		sc.close();

		// 出力
		System.out.println(first_player - second_player);

	}

}