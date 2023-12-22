
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int minv = Integer.MAX_VALUE;
		int maxv = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int j = scanner.nextInt();
			if (maxv < j - minv)
				maxv = j - minv;
			if (j < minv)
				minv = j;
		}
		System.out.println(maxv);
	}
}