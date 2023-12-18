import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt(), m = scanner.nextInt();
			boolean[][] bomb = new boolean[h][w];
			Map<Integer, Integer> xCountMap = new HashMap<>(), yCountMap = new HashMap<>();
			IntStream.range(0, m).forEach(i -> {
				int x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
				bomb[x][y] = true;
				xCountMap.put(x, xCountMap.getOrDefault(x, 0) + 1);
				yCountMap.put(y, yCountMap.getOrDefault(y, 0) + 1);
			});
			List<Entry<Integer, Integer>> xCountEntries = xCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());
			List<Entry<Integer, Integer>> yCountEntries = yCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());
			int xCountMax = xCountEntries.get(0).getValue(), yCountMax = yCountEntries.get(0).getValue();
			int max = 0;
			for (Entry<Integer, Integer> xCountEntry : xCountEntries) {
				if (xCountEntry.getValue() < xCountMax) {
					break;
				}
				for (Entry<Integer, Integer> yCountEntry : yCountEntries) {
					if (yCountEntry.getValue() < yCountMax) {
						break;
					}
					max = Math.max(max, xCountEntry.getValue() + yCountEntry.getValue()
							- ((bomb[xCountEntry.getKey()][yCountEntry.getKey()]) ? 1 : 0));
				}
			}
			System.out.println(max);
		}
	}
}
