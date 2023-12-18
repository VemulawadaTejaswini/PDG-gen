import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			@SuppressWarnings("unused")
			int h = scanner.nextInt(), w = scanner.nextInt(), m = scanner.nextInt();
			Map<Data, Boolean> bombMap = new HashMap<>();
			Map<Integer, Integer> xCountMap = new HashMap<>(), yCountMap = new HashMap<>();
			IntStream.range(0, m).forEach(i -> {
				int x = scanner.nextInt() - 1, y = scanner.nextInt() - 1;
				bombMap.put(new Data(x, y), true);
				xCountMap.put(x, xCountMap.getOrDefault(x, 0) + 1);
				yCountMap.put(y, yCountMap.getOrDefault(y, 0) + 1);
			});
			List<Entry<Integer, Integer>> xCountEntries = xCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());
			List<Entry<Integer, Integer>> yCountEntries = yCountMap.entrySet().stream()
					.sorted((x, y) -> y.getValue().compareTo(x.getValue())).collect(Collectors.toList());
			int xCountMax = xCountEntries.get(0).getValue(), yCountMax = yCountEntries.get(0).getValue();
			for (Entry<Integer, Integer> xCountEntry : xCountEntries) {
				if (xCountEntry.getValue() < xCountMax) {
					break;
				}
				for (Entry<Integer, Integer> yCountEntry : yCountEntries) {
					if (yCountEntry.getValue() < yCountMax) {
						break;
					}
					if (null != bombMap.get(new Data(xCountEntry.getKey(), yCountEntry.getKey()))) {
						System.out.println(xCountMax + yCountMax);
						return;
					}
				}
			}
			System.out.println(xCountMax + yCountMax - 1);
		}
	}

	private static class Data {
		int x;
		int y;

		Data(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public int hashCode() {
			return Objects.hash(x, y);
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof Data) {
				Data data = (Data) o;
				return (x == data.x) && (y == data.y);
			}
			return false;
		}
	}
}
