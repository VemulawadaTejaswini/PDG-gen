
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final int x = sc.nextInt();

		int remindx = x;

		List<Integer> mlist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			mlist.add(sc.nextInt());
		}

		int count = 0;
		for (final int donuts : mlist) {
			remindx = remindx - donuts;
			count++;
		}

		if (remindx == 0) {
			System.out.println(count);
			return;
		}

		Collections.sort(mlist);
		count = count + (remindx / mlist.get(0));

		System.out.println(count);

	}

}
