import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if (n <= 100) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int ai = scan.nextInt();
				if (ai >= 0 && ai < 1000) {
					list.add(ai);
				}
			}
			Collections.reverse(list);
			for (int i = 0; i < list.size(); i++) {
				if (i == (list.size() - 1)) {
					System.out.println(list.get(i));
				} else {
					System.out.print(list.get(i) + " ");
				}
			}
		}
	}
}