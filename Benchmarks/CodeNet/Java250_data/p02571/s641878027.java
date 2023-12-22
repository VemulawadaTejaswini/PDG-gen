import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute21_2();
	}

	private static void execute21_2() {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			String t = sc.next();

			int ans = 999999;

			for (int x = 0; x <= s.length() - t.length(); x++) {
				int a=0;
				for (int i = 0; i < t.length(); i++) {

					if (t.charAt(i) != s.charAt(i + x)) {
						a++;
					}
				}
				ans=Math.min(ans, a);
			}
			System.out.println(ans);
		}
	}
}