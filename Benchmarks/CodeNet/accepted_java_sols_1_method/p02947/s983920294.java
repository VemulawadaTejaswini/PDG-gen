import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];
		Map<String, Integer> map = new HashMap<String, Integer>();
		long result = 0;
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
			char ch[] = s[i].toCharArray();
			Arrays.sort(ch);
			String sch = new String(ch);
			if (map.containsKey(sch)) {
				map.replace(sch, map.get(sch) + 1);
				result += map.get(sch);
			} else {
				map.put(sch, 0);
			}
		}

		System.out.println(result);

		sc.close();
	}
}