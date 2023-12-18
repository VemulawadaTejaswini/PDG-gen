import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		List<String> w = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String tmp = sc.next();
			if (w.contains(tmp)) {
				System.out.println("No");
				return;
			}
			w.add(tmp);
		}
		for (int i = 0; i < w.size() - 1; i++) {
			String string = w.get(i);
			String nextString = w.get(i + 1);
			char last = string.charAt(string.length() - 1);
			char first = nextString.charAt(0);
			if (last != first) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		sc.close();
	}
}