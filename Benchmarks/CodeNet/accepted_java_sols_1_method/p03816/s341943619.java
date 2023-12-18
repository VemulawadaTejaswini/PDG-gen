import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Set set = new TreeSet();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			set.add(k);
		}
		if (set.size() % 2 == 0) {
			System.out.println(set.size() - 1);
		} else {
			System.out.println(set.size());
		}
	}
}
