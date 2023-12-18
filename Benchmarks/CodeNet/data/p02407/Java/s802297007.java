import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num <= 100) {
			int array[] = new int[num];
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < array.length; i++) {
				int next = scanner.nextInt();
				list.add(next);
			}
			if (0 <= list.size() && list.size() < 1000) {
				Collections.reverse(list);
				System.out.print(list);
			}
		}
	}
}