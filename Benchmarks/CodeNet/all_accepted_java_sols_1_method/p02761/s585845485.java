import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();

		Map<Integer, Integer> map = new HashMap<>();
		boolean fin = false;
		for (int i=0; i<M; i++) {
			int key = scan.nextInt();
			int value = scan.nextInt();
			if (map.get(key) == null) {
				map.put(key, value);
			}
			else {
				int v2 = map.get(key);
				if (v2 != value) {
					System.out.println(-1);
					fin = true;
					break;
				}
			}
		}

		StringBuilder ans = new StringBuilder();
		if (!fin) {
			for (int i=1; i<=N; i++) {
				if (map.get(i) == null) {
					if (i == 1 && N != 1) {
						ans.append(1);
					}
					else {
						ans.append(0);
					}
				}
				else {
					if (i == 1 && map.get(i) == 0 && N != 1) {
						System.out.println(-1);
						fin = true;
						break;
					}
					ans.append(map.get(i));
				}
			}
			if (!fin) {
				System.out.println(ans);
			}
		}
	}
}
