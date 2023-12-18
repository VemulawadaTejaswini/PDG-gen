import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<String> items = new TreeSet<String>();
		final int N = Integer.parseInt(in.next());
		for(int i = 0; i < N; i++) {
			items.add(in.next());
		}
		System.out.println(items.size());
	}
}