import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> s = new HashSet<Integer>(n);
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		int q = sc.nextInt();
		Set<Integer> t = new HashSet<Integer>(q);
		for (int i = 0; i < q; i++) {
			t.add(sc.nextInt());
		}
		int count = 0;
		Iterator<Integer> itr = s.iterator();
		for (int i = 0; i < n; i++) {
			if (t.contains(itr.next()))
				count++;
		}
		System.out.println(count);
	}
}