import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int H[] = new int[N];
		String s = "Yes";

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < N - 1; i++) {
			if (H[i] < H[i + 1]) {
				H[i + 1]--;
			}
		}
		int h[] = new int[N];
		for (int i = 0; i < N; i++) {
			h[i] = H[i];
		}
		Arrays.sort(H);

		for (int i = 0; i < N; i++) {
			if (h[i] != H[i]) {
				s = "No";
			}
		}
		System.out.println(s);
	}

}
