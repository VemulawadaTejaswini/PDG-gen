import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		String[] in = input.split(" ");
		if (n <= 100) {
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				int ai = Integer.parseInt(in[i]);
				if (ai >= 0 && ai < 1000) {
					list.add(ai);
				}
			}
			Collections.reverse(list);
			for (int num : list) {
				System.out.print(num + " ");
			}
		}
	}
}