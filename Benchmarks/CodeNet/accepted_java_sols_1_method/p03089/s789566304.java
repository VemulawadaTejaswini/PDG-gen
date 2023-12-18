import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		LinkedList<Integer> al = new LinkedList<>();
		LinkedList<Integer> ans = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			al.add(sc.nextInt());
		}
		ListIterator<Integer> ite = al.listIterator(al.size());
		while (ite.hasPrevious()) {
			int ind = ite.previousIndex() + 1;
			int pre = ite.previous();
			if (pre == ind) {
				ans.add(pre);
				ite.remove();
				ite = al.listIterator(al.size());
			}
		}
		if (al.isEmpty()) {
			ite = ans.listIterator(ans.size());
			while (ite.hasPrevious()) {
				System.out.println(ite.previous());
			}
		} else {
			System.out.println(-1);
		}
	}
}