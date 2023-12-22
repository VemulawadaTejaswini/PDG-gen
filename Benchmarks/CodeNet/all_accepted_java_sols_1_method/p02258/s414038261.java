import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
//		Scanner sc = new Scanner(new BufferedReader(new FileReader("/workspace/AOJ/src/section1/in38.txt")));

		int n = sc.nextInt();
		int[] r = new int[n];
		for (int t = 0; t < n; t++) {
			r[t] = sc.nextInt();
		}

		int min = Integer.MAX_VALUE;
		int ans = Integer.MIN_VALUE;


		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, r[i] - min);
			if (min > r[i]) {
				min = r[i];
			}
		}
		System.out.println(ans);
	}
}

