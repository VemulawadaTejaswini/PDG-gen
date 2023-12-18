
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			Map<int[], Integer> memo = new HashMap<int[], Integer>();
			memo.put(new int[0], 0);
			int count = 0;
			for (int i = 0; i < 10; i++) {
				Map<int[], Integer> memotmp = new HashMap<int[], Integer>();
				memotmp.putAll(memo);
				for (Entry<int[], Integer> entry : memo.entrySet()) {
					if (entry.getKey().length < n || entry.getValue() + i <= s) {
						int[] k = Arrays.copyOf(entry.getKey(),
								entry.getKey().length + 1);
						k[entry.getKey().length] = i;
						int v = entry.getValue() + i;
						memotmp.put(k, v);
						if (k.length == n && v == s) {
							count++;
						}
					}
				}
				memo = memotmp;
			}
			System.out.println(count);	
		}
	}
}