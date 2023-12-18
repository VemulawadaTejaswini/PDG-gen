import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<Integer> list = new ArrayList<>();
		if (n <= 100) {
			for (int i = 0; i < n; i++) {
				int ai = scan.nextInt();
				if (ai >= 0 && ai < 1000) {
					list.add(ai);
				}
			}
		}
		Collections.reverse(list);
		for (int out : list) {
			System.out.print(out + " ");
		}
	}
}