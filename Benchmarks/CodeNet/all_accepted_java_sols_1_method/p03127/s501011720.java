import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		int a = sc.nextInt();
		set.add(a);
		for (int i = 1; i < n; i++) {
			int ai = sc.nextInt();
			set.add(ai % a);
		}
		sc.close();

		while (set.size() > 1) {
			TreeSet<Integer> tempSet = set;
			set = new TreeSet<Integer>();
			tempSet.remove(0);
			Integer[] array = tempSet.toArray(new Integer[0]);
			a = array[0];
			set.add(a);
			for (int i = 1; i < array.length; i++) {
				set.add(array[i] % a);
			}
		}
		System.out.println(set.first());
	}
}
