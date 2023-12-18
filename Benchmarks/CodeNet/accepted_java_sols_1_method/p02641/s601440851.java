
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int p = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			p = Integer.parseInt(sc.next());
			map.put(p, p);
		}

		int ans = 0;
		for (int i = 0; i <= 50; i++) {
			if (!map.containsKey(x - i)) {
				ans = x - i;
				break;
			}
			if (!map.containsKey(x + i)) {
				ans = x + i;
				break;
			}
		}

		System.out.println(ans);
	}

}
