import java.util.*;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		List<Integer> box = new ArrayList<>();
		int count = 0;
 
		// 与えられた初期値によってリストを作成
		for (int i = 1; i <= a; i++) {
			box.add(sc.nextInt());
		}
		while (check(box)) {
			box = divide(box);
			count++;
		}
		System.out.println(count);
	}
 
	/**
	 * 格納された全ての値が偶数かそうではないかをチェックするメソッド
	 * 
	 * @param box
	 * @return boolean
	 */
	private static boolean check(List<Integer> box) {
		for (int i = 0; i < box.size(); i++) {
			if (box.get(i) % 2 == 1) {
				return false;
			}
		}
		return true;
	}
 
	/**
	 * リストを受け取って、各値を2で割った値を返す
	 * 
	 * @param box
	 * @return List<Integer>
	 */
	private static List<Integer> divide(List<Integer> box) {
		List<Integer> dividedBox = new ArrayList<>();
		for (int i = 0; i < box.size(); i++) {
			dividedBox.add(box.get(i) / 2);
		}
		return dividedBox;
	}
}
