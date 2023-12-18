import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Deque<Integer>> list = new ArrayList<>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(new ArrayDeque<>());
		}
		for (int i = 0; i < q; i++) {
			switch (sc.nextInt()) {
			case 0:
				list.get(sc.nextInt()).addLast(sc.nextInt());
				break;
			case 1:
				int t = sc.nextInt();
				if (!list.get(t).isEmpty()) {
					System.out.println(list.get(t).peekFirst());
				}
				break;
			case 2:
				t = sc.nextInt();
				if (!list.get(t).isEmpty()) {
					list.get(t).removeFirst();
				}
				break;
			}
		}
		sc.close();
	}
}

