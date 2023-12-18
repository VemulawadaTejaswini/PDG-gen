import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		int n = sc.nextInt();
		while (sc.hasNextInt()) {
			set.add(sc.nextInt());
		}
		System.out.println(set.size());
	}
}