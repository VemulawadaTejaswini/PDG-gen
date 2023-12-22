import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0515-input.txt"));
		while (true) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			if (n == 0 & k == 0)
				break;

			int[] e = new int[k];
			int max = 0;
			for (int i = 0; i < k; i++) {
				max += (e[i] = scan.nextInt());
			}
			int cur = max;
			for (int i = 0, j = k; j < n; i++, j++) {
				if (i >= k)
					i = 0;
				cur -= e[i];
				e[i] = scan.nextInt();
				cur += e[i];
				if (cur > max)
					max = cur;
			}
			System.out.println(max);
		}

		scan.close();
		System.exit(0);
	}

}