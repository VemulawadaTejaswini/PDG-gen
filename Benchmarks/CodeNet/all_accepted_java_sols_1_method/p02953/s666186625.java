import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int H[] = new int[N];
		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		boolean f = true;
		for (int i = 1; i < N; i++) {
			if (H[i] > H[i - 1]) {
				H[i]--;
			}
			if (H[i] < H[i - 1]) {
				if (H[i] - 1 < H[i - 1]) {
					f = false;
					break;
				} else
					H[i]--;
			}
		}
		System.out.println(f ? "Yes" : "No");

	}
}