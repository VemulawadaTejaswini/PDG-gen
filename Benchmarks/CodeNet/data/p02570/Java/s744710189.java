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
			int d = sc.nextInt();
			int t = sc.nextInt();
			int s = sc.nextInt();

			int ans = 999999;

			if(t*s>=d) {
				
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}