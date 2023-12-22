import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> priceList = new ArrayList<>();

		for(int i = 0; i < N; i++) {
			int num = sc.nextInt();
			priceList.add(num);
		}

		sc.close();

		Collections.sort(priceList);

		int answer = 0;

		for(int i = 0; i < K; i++) {
			answer += priceList.get(i);
		}

		System.out.println(answer);

	}

}
