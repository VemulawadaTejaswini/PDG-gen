import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = Integer.parseInt(sc.next());
		}
		int pos = 0;

		List<Integer> boundPos = new ArrayList<>();
		boundPos.add(0);
		for (int i = 0; i < n; i++) {
			pos += l[i];
			boundPos.add(pos);
		}

		System.out.println(boundPos.stream().filter(i -> i <= x).count());

	}

}
