import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		long ans = 0;
		int plus = s.length() - 1;
		int max = (int) Math.pow(2, plus);
		for (int i = 0; i < max; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < 9; j++) {
				if ((i >> j) % 2 == 1) {
					list.add(j + 1);
				}
			}
			int start = 0;
			for (int end : list) {
				ans += Long.parseLong(s.substring(start, end));
				start = end;
			}
			ans += Long.parseLong(s.substring(start, s.length()));
		}
		System.out.println(ans);
	}
}
