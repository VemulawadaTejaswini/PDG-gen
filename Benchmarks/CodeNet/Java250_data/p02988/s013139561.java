import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] tmp = new int[3];
		int answer = 0;

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}

		for (int i = 1; i < n - 1; i++) {
			tmp[0] = p[i - 1];
			tmp[1] = p[i];
			tmp[2] = p[i + 1];

			Arrays.sort(tmp);

			if (p[i] == tmp[1]) answer++;
		}

		System.out.println(answer);
	}
}
