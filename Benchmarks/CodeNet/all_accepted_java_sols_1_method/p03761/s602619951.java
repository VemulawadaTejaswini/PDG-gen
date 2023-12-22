import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static char[] al = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z' };

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();
		for (int i = 0; i < N; i++) {
			char[] s = in.next().toCharArray();
			Integer[] count = new Integer[26];
			Arrays.fill(count, 0);
			for (int j = 0; j < s.length; j++) {
				count[s[j] - 'a'] += 1;
			}
			map.put(i, count);
		}
		int[] alCount = new int[26];
		for (int i = 0; i < al.length; i++) {
			int min = Integer.MAX_VALUE;
			for (Map.Entry<Integer, Integer[]> entry : map.entrySet()) {
				min = Math.min(min, entry.getValue()[i]);
			}
			alCount[i] = min;
		}
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < alCount.length; i++) {
			for (int j = 0; j < alCount[i]; j++) {
				ans.append(al[i]);
			}
		}
		System.out.println(ans.toString());
		in.close();
	}
}