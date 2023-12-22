import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			map.put(i, sc.nextInt());
		}

		int cnt = 0;
		cnt += map.get(0);


		for (int i = 1; i < N; i++) {
			if (map.get(i-1) < map.get(i)) {
				cnt += map.get(i) - map.get(i-1);
			}
		}
		System.out.println(cnt);
	}
}
