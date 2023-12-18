import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Problem().solve();
	}
}

class Problem {
	enum Mark {
		S(0), H(1), C(2), D(3);
		public final int id;
		Mark(int id) {
			this.id = id;
		}
		public static final int MARK_NUM = 4;
		public static int size() {
			return values().length;
		}
	}
	
	enum Rank {
		;
		public static final int MAX = 13;
	}
	
	public void solve() {
		List<List<Boolean>> cards = new ArrayList<>(Mark.MARK_NUM);
		for (int i = 0; i < Mark.MARK_NUM; i++) {
			List<Boolean> list = new ArrayList<>(Collections.nCopies(Rank.MAX,
					Boolean.valueOf(false)));
			cards.add(list);
		}
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0, n = sc.nextInt(); i < n; i++) {
			Mark mark = Mark.valueOf(sc.next());
			int rank = sc.nextInt();
			cards.get(mark.id).set(rank - 1, true);
		}
		sc.close();
		
		for (Mark mark : Mark.values()) {
			for (int i = 0; i < Rank.MAX; i++) {
				if (!cards.get(mark.id).get(i)) {
					System.out.println(mark.name() + " " + (i + 1));
				}
			}
		}
	}
}