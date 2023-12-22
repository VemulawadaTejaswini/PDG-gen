import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for (int i = 0 ; i < n ; i++) {
			int t = sc.nextInt();
			if (!list.contains(t)) list.add(t);
		}
		System.out.println(list.size());
	}
}
