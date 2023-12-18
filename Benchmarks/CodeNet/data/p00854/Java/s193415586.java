import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			int size = n;
			if (n == 0 && k == 0 && m == 0)
				break;
			List<Integer> list = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				list.add(i + 1);
			}
			int current = m - 2;
			list.remove(current + 1);
			size--;
			for (int i = 0; i < n - 2; i++) {
				int x = (current + k) % size;
				current = x == 0 ? size - 2 : x - 1;
				list.remove(x);
				size--;
			}
			System.out.println(list.get(0));
		}
	}
}