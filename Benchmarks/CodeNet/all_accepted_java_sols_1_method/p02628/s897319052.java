import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		//入力表示
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);

		int ans = 0;
		for (int i = 0; i < K; ++i) {
			ans += list.get(i);
		}
		System.out.println(ans);
      
    }
}