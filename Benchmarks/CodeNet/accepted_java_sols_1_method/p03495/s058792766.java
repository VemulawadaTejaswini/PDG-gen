import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		Map<Integer, Integer> map = new HashMap<>();

		IntStream.range(0, n).forEach(i -> {int a = Integer.parseInt(sc.next());
											map.put(a, map.getOrDefault(a, 0) + 1);}
									 );

		int ans = (k < map.size()) ? map.values().stream()
												 .sorted()
												 .limit(map.size() - k)
												 .mapToInt(Integer::intValue)
												 .sum()
								   : 0;

		System.out.println(ans);

		sc.close();
	}
}