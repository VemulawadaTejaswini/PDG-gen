import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    set.add(sc.nextInt());
		}
		int m = sc.nextInt();
		TreeSet<Integer> result = new TreeSet<>();
		for (int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    if (set.contains(x)) {
		        set.remove(x);
		    } else {
		        result.add(x);
		    }
		}
		result.addAll(set);
		StringBuilder sb = new StringBuilder();
		for (int x : result) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}

