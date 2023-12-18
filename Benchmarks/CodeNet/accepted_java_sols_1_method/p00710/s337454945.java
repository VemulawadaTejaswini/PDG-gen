import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0) break;
			LinkedList<Integer> list = new LinkedList<>();
			for (int i = 0; i < n; ++i)
				list.add(i + 1);
			for (int k = 0; k < r; ++k) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int j = 0; j < c; ++j) {
					int idx = n - (p - 1 + c);
					int mv = list.get(idx);
					list.remove(idx);
					list.add(mv);
				}
			}
			System.out.println(list.get(list.size() - 1));
		}
	}
}
