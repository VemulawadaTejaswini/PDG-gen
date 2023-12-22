import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		String[] ss = new String[n];

		for (int i = 0; i < n; i++) {
			char[] cs = sc.nextLine().toCharArray();
			Arrays.sort(cs);
			ss[i] = new String(cs);
		}

		Arrays.sort(ss);
		List<Long> same = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			long count = 1;
			while (i < n && ss[i].equals(ss[i - 1])) {
				i++;
				count++;
			}
			if (count > 1) same.add(count);
		}
		long answer = 0;
		for (Long m : same) answer += m * (m - 1) / 2;
		System.out.println(answer);
	}
}
