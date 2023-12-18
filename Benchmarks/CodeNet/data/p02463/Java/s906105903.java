import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
		    set.add(sc.nextInt());
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    set.add(sc.nextInt());
		}
		StringBuilder sb = new StringBuilder();
		for (int x : set) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}

