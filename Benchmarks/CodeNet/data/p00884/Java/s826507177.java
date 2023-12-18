import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, ArrayList<String>> map;

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			sc.nextLine();
			String firstGroup = null;
			map = new HashMap<String, ArrayList<String>>();
			for (int i = 0; i < N; ++i) {
				String[] elems = sc.nextLine().split(":|,|\\.");
				ArrayList<String> member = new ArrayList<String>();
				for (int j = 1; j < elems.length; ++j) {
					member.add(elems[j]);
				}
				map.put(elems[0], member);
				if (i == 0) firstGroup = elems[0];
			}
			HashSet<String> set = new HashSet<String>();
			get(set, firstGroup);
			System.out.println(set.size());
		}
	}

	static void get(HashSet<String> set, String name) {
		if (map.containsKey(name)) {
			for (String c : map.get(name)) {
				get(set, c);
			}
		} else {
			set.add(name);
		}
	}

}