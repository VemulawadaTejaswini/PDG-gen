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

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		int count = 0;
		int min = Collections.max(list);

		for (int i = 0; i < N; i++) {
			if (list.get(i) <= min) {
				min = list.get(i);
				count++;
			}

		}
		System.out.println(count);
		}
}