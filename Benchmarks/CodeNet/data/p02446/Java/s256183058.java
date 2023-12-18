import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}
		StringBuilder sb = new StringBuilder();
		for (int num : set) {
			sb.append(num + " ");
		}
		String str = sb.toString();
		str = str.substring(0, str.length() - 1);
		System.out.println(str);
	}
}

