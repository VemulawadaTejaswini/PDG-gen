import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; i < 4; i++) {
			set.add(sc.nextInt());
		}
		if (set.contains(1) && set.contains(9) && set.contains(7) && set.contains(4)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}