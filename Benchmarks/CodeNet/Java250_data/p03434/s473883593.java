
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// 配列を準備
		// int[] array = new int[N];
		// 最初からリスト
		List<Integer> list = new ArrayList<>();
		// for文でN回繰り返し
		for (int i = 0; i < N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		// Collections.reverse(list);
		// 本当に反対にする必要があるか？
		// 大きい方から小さい方に？ 小さい方から大きい方に？⇒後で。

		// for(int i = 0; i < list.size();i++) {
		// 配列に対する操作であって、Collectionsに合わせたループがある
		int result = 0;
		ListIterator<Integer> i = list.listIterator();
		while (i.hasNext()) {
			// if (flag) {
			if (i.nextIndex() % 2 == 0) {
				// true なので Alice
				// 該当カードを取得する
				// AliceMaxCount += i.next();
				result += i.next();
			} else {
				// Bob
				// BobMaxCount += i.next();
				result -= i.next();
			}
		}
		System.out.println(Math.abs(result));
		sc.close();
	}
}