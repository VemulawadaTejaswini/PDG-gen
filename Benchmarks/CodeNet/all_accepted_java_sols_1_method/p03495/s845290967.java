import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());

			map.put(a, map.getOrDefault(a, 0) + 1);
		}

		int ans = 0;

		if (k < map.size()) {
			ans = map.values().stream()
							  .sorted()
							  .limit(map.size() - k)
							  .mapToInt(x -> x)
							  .sum();
		}

		System.out.println(ans);

		sc.close();
	}
}