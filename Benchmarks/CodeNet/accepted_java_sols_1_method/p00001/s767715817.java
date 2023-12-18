import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int list_max = 10;
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 標準入力を取得
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < list_max; i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1));
		System.out.println(list.get(list.size()-2));
		System.out.println(list.get(list.size()-3));
	}
}