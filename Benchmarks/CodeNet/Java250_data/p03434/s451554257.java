import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data;
		int cnt = 0;
		int alice = 0;
		int bob = 0;
		ArrayList<Integer> lists = new ArrayList<Integer>();

		//リストに追加
		//		for (int list : lists) {
		//			lists.add(sc.nextInt());
		//		}
		for (int i = 0; i < n; i++) {
			lists.add(sc.nextInt());
		}

		//ソート
		Collections.sort(lists, Collections.reverseOrder());
		//		Arrays.sort(lists, Collections.reverseOrder());

		//ソートしたものを表示
		Iterator<Integer> it = lists.iterator();
		while (it.hasNext()) {
			data = it.next();
			//			System.out.println(data);
			if (cnt % 2 == 0) {
				alice = alice + data;
				cnt++;
			} else {
				bob = bob + data;
				cnt++;
			}
		}

		System.out.println(alice - bob);
	}

}
