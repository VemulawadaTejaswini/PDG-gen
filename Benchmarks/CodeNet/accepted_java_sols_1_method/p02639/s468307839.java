import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}

		int ans = 0;

		for (int i = 0; i < 5; i++) {
			if (list.get(i) != (i + 1)) {
				ans = (i + 1);
			}
		}

		System.out.println(ans);
	}

}
