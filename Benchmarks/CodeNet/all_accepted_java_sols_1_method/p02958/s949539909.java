import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

		int miss = 0;
		for (int i = 0; i < N; i++) {
			if (p[i] != i + 1) {
				miss += 1;
			}
		}
		if (miss == 0 || miss == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}