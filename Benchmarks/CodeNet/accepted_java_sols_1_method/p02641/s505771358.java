import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int ans = 0;
		Set<Integer> dict = new HashSet<>();
		for (int i = 0; i < n; i++) {
			dict.add(sc.nextInt());
		}
		int diff = 0;
		while (true) {
			int a = x - diff;
			if (!dict.contains(a)) {
				ans = a;
				break;
			}
			a = x + diff;
			if (!dict.contains(a)) {
				ans = a;
				break;
			}
			diff++;
		}
		System.out.println(ans);
	}
}






