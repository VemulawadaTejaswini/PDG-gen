
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			while (n-- > 0) {
				int sum = 0;
				int num = scanner.nextInt();
				for (int i = 0; i < 4; i++) {
					sum += scanner.nextInt() * 60;
					sum += scanner.nextInt();
				}
				map.put(sum, num);
			}
			int count = 0;
			int size = map.size();
			for (int entry : map.values()) {
				if (count == 0 || count == 1 || count == size - 2)
					System.out.println(entry);
				count++;
			}
		}
	}
}