import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> cells = new ArrayList<Integer>();

		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			if (i % 2 == 0) {
				cells.add(num);
			}
		}

		int ans = (int) cells.stream().filter(x -> x % 2 == 1).count();
		System.out.println(ans);
	}
}