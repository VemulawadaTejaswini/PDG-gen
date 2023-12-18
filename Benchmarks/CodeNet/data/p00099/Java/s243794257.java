
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int s = scanner.nextInt();
		int[] max = new int[1000];

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < s; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (list.size() < a) {
				list.add(b);
				max[b]++;
			} else {
				int x = list.get(a - 1);
				max[x]--;
				max[x + b]++;
				list.set(a - 1, x + b);
			}
			for (int j = 999; j >= 0; j--) {
				if (max[j] != 0) {
					int maxv = j;
					System.out.println(list.indexOf(maxv)+1 + " " + maxv);
					break;
				}
			}
		}
	}
}