
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();
		List<Integer> pickUP = new LinkedList<Integer>();
		LinkedList<Integer> cards = new LinkedList<Integer>();
		while (n != 0 && r != 0) {
			cards.clear();
			for (int i = 0; i < n; i++) {
				cards.addFirst(i + 1);
			}
			for (int i = 0; i < r; i++) {
				pickUP.clear();
				int from = in.nextInt() - 1;
				int to = in.nextInt() + from;
				List<Integer> subList = cards.subList(from, to);
				pickUP.addAll(subList);
				subList.clear();
				cards.addAll(0, pickUP);
			}
			System.out.println(cards.peekFirst());
			n = in.nextInt();
			r = in.nextInt();
		}
	}
}