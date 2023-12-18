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
		execute19_1();
	}

	private static void execute19_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] t = new int[n];

			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
			}

			int min = 0;
			int max = 1010010010;

			while (max - min > 1) {
				int middle = (max + min) / 2;
				long count = 0;
				for (int i = 0; i < n; i++) {
					count += (t[i] - 1) / middle;
				}
				if (count > k) {
					min = middle;
				} else {
					max = middle;
				}
			}
			System.out.println(max);
		}
	}
}