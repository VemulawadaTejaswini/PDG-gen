import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0526-input.txt"));

		while (scan.hasNext()) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0)
				break;
			Darts d = new Darts(n, m);
			for (int i = 0; i < n; i++)
				d.add(scan.nextInt());
			System.out.println(d.max());
		}
		scan.close();
		System.exit(0);
	}
}

class Darts {
	List<Integer> score = new ArrayList<Integer>();
	int M;

	public Darts(int n, int m) {
		M = m;
		score.add(0);
	}

	public int max() {
		score.sort(null);
		Integer[] sc = score.toArray(new Integer[score.size()]);

		int max = 0;
		for (int i = 0; i < sc.length; i++)
			for (int j = i; j < sc.length; j++) {
				if (sc[i] + sc[j] > M)
					break;
				for (int k = j; k < sc.length; k++) {
					if (sc[i] + sc[j] + sc[k] > M)
						break;
					for (int l = k; l < sc.length; l++) {
						int tot = sc[i] + sc[j] + sc[k] + sc[l];
						if (tot > M)
							break;
						if (max < tot)
							max = tot;
					}
				}
			}

		return max;
	}

	public void add(int s) {
		if (s <= M)
			score.add(s);
	}
}