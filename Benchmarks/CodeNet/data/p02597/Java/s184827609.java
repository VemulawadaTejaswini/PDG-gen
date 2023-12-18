import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();

		String str = sc.nextLine();
		char[] charr = str.toCharArray();

		ArrayList<Integer> rList = new ArrayList<Integer>();
		ArrayList<Integer> wList = new ArrayList<Integer>();

		// 左側からWがあったら
		// 右側のRと交換

		// Rの番地リストと、Wの番地リストをつくる
		for (int i = 0; i < charr.length; i++) {

			if (charr[i] == (char) 'R') {
				rList.add(i);
			} else {
				wList.add(i);
			}

		}

		// wListを左から、rListを右からたどる
		Collections.reverse(rList);
		int count = 0;

		int listmax;

		if (rList.size() > wList.size()) {
			listmax = wList.size();
		} else {
			listmax = rList.size();
		}

		for (int j = 0; j < listmax; j++) {
			if (rList.get(j) < wList.get(j)) {
				break;
			}
			count++;
		}

		System.out.println(count);
	}

}