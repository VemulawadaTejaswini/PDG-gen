import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		Map<String, Integer> map = new HashMap<>();
		while (sc.hasNext()) {
			char[] array = sc.nextLine().toCharArray();
			Arrays.sort(array);
			String input = String.valueOf(array);
			Integer integer = map.getOrDefault(input, 0);
			map.put(input, integer + 1);
		}
		long sum = 0;
		for (Integer v : map.values()) {
			sum = (v * (v - 1l) / 2l) + sum;
		}
		System.out.println(sum);
	}
}
