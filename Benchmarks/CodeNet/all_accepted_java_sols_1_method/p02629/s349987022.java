import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1,000,000,000,000,001
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		List<String> list = Arrays.asList("abcdefghijklmnopqrstuvwxyz".split(""));
		List<Integer> q = new ArrayList<>();
		while (n > 0) {
			q.add((int) ((n-1) % 26));
			n = (n-1) / 26;
		}
		Collections.reverse(q);
		StringBuilder sb = new StringBuilder();
		for (Integer i : q) {
			sb.append(list.get(i));
		}
		System.out.println(sb.toString());

	}
}
