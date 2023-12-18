import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.next();
			int len = str.length();
			List<String> numarr = new ArrayList<>();
			if (len == 1) {
				System.out.print(Integer.parseInt(str));
				return;
			}
			long ans = 0;
			Set<Integer> set = new HashSet<>();
			for (int bit = 0; bit < 1 << len - 1; bit++) {
				for (int i = 0; i < len - 1; i++) {
					if ((bit & 1 << i) != 0) {
						set.add(i);
					}
				}
				int last = 0;
				for (int i : set) {
					numarr.add(str.substring(last, i + 1));
					last = i + 1;
				}
				numarr.add(str.substring(last, len));
				for (String e : numarr) {
					ans += Long.parseLong(e);
				}
				set.clear();
				numarr.clear();
			}
			System.out.print(ans);
		}
	}
}