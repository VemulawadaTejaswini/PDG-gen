import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && k == 0 && m == 0)
				break;
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 0; i < n; i++)
				list.add(i + 1);
			for (int i = 0; i < m - 1; i++) {
				int r = list.poll();
				list.add(r);
			}
			list.removeFirst();
			while (list.size() > 1) {
				for (int i = 0; i < (k - 1 % list.size()); i++) {
					int r = list.poll();
					list.add(r);
				}
				list.removeFirst();
			}
			int r = list.poll();
			System.out.println(r);
		}
		sc.close();
	}
}