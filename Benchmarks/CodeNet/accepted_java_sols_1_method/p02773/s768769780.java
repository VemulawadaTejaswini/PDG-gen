import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		sc.close();

		HashMap<String, Integer> map = new HashMap<>();
		int cntmax = 0;
		for ( String s : S ) {
			if ( map.containsKey(s) ) {
				int cnt = map.get(s) + 1;
				map.put(s, cnt);
				cntmax = Math.max(cnt, cntmax);
			} else {
				map.put(s, 1);
				cntmax = Math.max(1, cntmax);
			}
		}

		ArrayList<String> list = new ArrayList<>();
		for (String s : map.keySet()) {
			if ( map.get(s) == cntmax ) {
				list.add(s);
			}
		}
		String[] ans = list.toArray(new String[list.size()]);
		Arrays.sort(ans);

		StringBuilder ret = new StringBuilder();
		for ( String s : ans ) {
			ret.append(s);
			ret.append("\n");
		}
		System.out.println(ret.toString());
	}
}
