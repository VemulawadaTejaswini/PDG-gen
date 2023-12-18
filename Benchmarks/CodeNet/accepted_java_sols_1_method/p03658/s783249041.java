import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();

		List<Integer> stickLenList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			stickLenList.add(sc.nextInt());
		}
		Collections.sort(stickLenList, Collections.reverseOrder());

		int[] ans = { 0 };
		stickLenList.subList(0, k).stream().forEach(e -> ans[0] += e);

		System.out.println(ans[0]);

		sc.close();
	}
}