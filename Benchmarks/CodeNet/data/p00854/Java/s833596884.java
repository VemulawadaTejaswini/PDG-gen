import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if ((n | k | m) == 0)
				break;
			Stone head = new Stone(1);
			Stone t = head;
			for (int i = 2; i <= n; i++) {
				Stone s = new Stone(i);
				t.next = s;
				t = t.next;
			}
			t.next = head;
			t = head;
			for (int i = 1; i < m - 1; i++) {
				t = t.next;
			}
			deleteNext(t);
			while (!t.next.equals(t)) {
				for (int i = 0; i < k - 1; i++) {
					t = t.next;
				}
				deleteNext(t);
			}
			System.out.println(t.id);
		}
	}

	static void deleteNext(Stone s) {
		Stone t = s.next;
		s.next = t.next;
	}

}

class Stone {
	int id;
	Stone next;

	Stone(int i) {
		id = i;
	}

	@Override
	public boolean equals(Object s) {
		if (!(s instanceof Stone))
			return false;
		return ((Stone) s).id == id;
	}
}