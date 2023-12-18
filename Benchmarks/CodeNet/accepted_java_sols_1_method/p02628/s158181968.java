import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		ArrayList<Integer> prices = new ArrayList<>();
		int total = 0;

		for (int i = 0; i < N; i++) {
			int p = scanner.nextInt();
			prices.add(p);
		}

		Collections.sort(prices);

		for (int j = 0; j < K; j++) {
			int price = prices.get(j);
			total += price;
		}

		System.out.println(total);
	}

}