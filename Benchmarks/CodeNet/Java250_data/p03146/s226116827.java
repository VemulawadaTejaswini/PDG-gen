import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = Integer.parseInt(sc.next());
		List<Integer> a = new ArrayList<>();
		a.add(s);
		int ans = 0;
		for (int i = 0; i < 1000000; i++) {
			int ai = a.get(i) % 2 == 0 ? a.get(i) / 2 : 3 * a.get(i) + 1;
			if (a.contains(ai)) {
				ans = i + 2;
				break;
			}
			a.add(ai);
		}
		System.out.println(ans);
		sc.close();
	}
}