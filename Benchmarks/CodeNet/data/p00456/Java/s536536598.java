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
		// Scanner scan = new Scanner(new
		// File("D:\\UserArea\\J0124567\\Downloads\\0531-input.txt"));

		while (scan.hasNext()) {

			int n = 2;
			for (int i = 0; i < n; i++) {
				TOP3 top3 = new TOP3();
				int k = 10;
				for (int j = 0; j < k; j++)
					top3.e(scan.nextInt());
				if (i > 0)
					System.out.print(" ");
				System.out.print(top3.s());
			}
			System.out.println();

			scan.close();
			System.exit(0);
		}
	}
}

class TOP3 {
	int[] sc = new int[3];

	public void e(int x) {
		if (x < sc[0])
			return;

		sc[0] = x;
		for (int i = 0; i < 2; i++)
			if (sc[i] > sc[i + 1]) {
				int tmp = sc[i];
				sc[i] = sc[i + 1];
				sc[i + 1] = tmp;
			}
	}

	public int s() {
		int tot = 0;
		for (int i = 0; i < 3; i++)
			tot += sc[i];
		return tot;
	}

}