
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(scanner.nextLine());
			if (n == 0) {
				break;
			}
			Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int[] sums = new int[n];
			for (int l = 0; l < n; l++) {
				StringTokenizer tokenizer = new StringTokenizer(
						scanner.nextLine());
				int k = Integer.parseInt(tokenizer.nextToken());
				int t = tokenizer.countTokens();
				int[] b = new int[t];
				int frame = 1;
				for (int i = 0; i < t; i++) {
					b[i] = Integer.parseInt(tokenizer.nextToken());
				}

				int j = 0;
				int sum = 0;
				while (j < b.length) {
					if (frame >= 10) {
						sum += b[j];
						j++;
					} else {
						sum += b[j] + b[j + 1];
						if (b[j] == 10) {
							sum += b[j + 2];
							j++;
						} else {
							if (b[j] + b[j + 1] == 10) {
								sum += b[j + 2];
							}
							j += 2;
						}
					}
					frame++;
				}
				sums[l] = sum;
				map.put(k, sum);
			}
			Arrays.sort(sums);
			for (int i = sums.length - 1; i >= 0; i--) {
				int k = 0;
				for(Entry<Integer, Integer> entry: map.entrySet()){
					if(entry.getValue() == sums[i]){
						k = entry.getKey();
						System.out.println(k+" "+ entry.getValue());
						break;
					}
				}
				map.remove(k);
			}

		}
	}
}