import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    set.add(sc.nextInt());
		}
		TreeSet<Integer> result = new TreeSet<>();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    if (set.contains(x)) {
		        result.add(x);
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int x : result) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}

