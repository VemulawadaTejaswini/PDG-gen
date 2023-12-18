import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 2; i < 300000; i++) {
			if (i % 7 == 1 || i % 7 == 6) {
				boolean e = false;
				for (int j = 0; j < a.size(); j++) {
					if (i % a.get(j) == 0) {
						e = true;
						break;
					}
				}
				if (!e)
					a.add(i);
			}
		}
		Integer[] ans = a.toArray(new Integer[a.size()]);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 1) break;
			System.out.print(n + ":");
			for (int i = 0; i < ans.length; i++) {
				if (n % ans[i] == 0) {
					System.out.print(" " + ans[i]);
				}
			}
			System.out.println();
		}
	}
}
