import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 20;
		while (true) {
			ArrayList<Integer> ary = new ArrayList<Integer>();
			num = sc.nextInt();

			if (num == 0) {
				// System.out.println();
				break;
			}
			for (int i = 0; i < num; i++) {
				int word = sc.nextInt();
				ary.add(word);
			}
			int min = ary.get(0);
			int max = ary.get(0);
			for (int i : ary) {
				if (i < min) {
					min = i;
				}
				if (i > max) {
					max = i;
				}
			}
			int index1 = ary.indexOf(min);
			ary.remove(index1);
			int index2 = ary.indexOf(max);
			ary.remove(index2);

			int sum = 0;
			for (int i : ary) {
				sum += i;
			}
			int ave = sum / ary.size();

			System.out.println(ave);
		}
		sc.close();
	}

}

