import java.util.Scanner;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int n = scan.nextInt();
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 2; i < n; i++) {
				set.add(i);
			}
			for (int i = 2; i < n; i++) {
				if (!set.contains(i)) continue;
				for (int j = i * 2; j < n; j += i) {
					set.remove(j);
				}
			}
			System.out.println(set.size());
		}
	}
}