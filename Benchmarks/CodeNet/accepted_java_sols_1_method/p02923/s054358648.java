import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int H[] = new int[N];

		int max = 0;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		int tmp = 0;

		for (int i = 0; i < N-1; i++) {
			if (H[i] >= H[i+1]) {
				for (int j = i; j < N; j++) {
					if (j == N-1) {
						max = Math.max(tmp,max);
						tmp = 0;
						i = j;
						break;
					}

					if (H[j] >= H[j+1]) {
						tmp++;
					} else {
						max = Math.max(tmp,max);
						tmp = 0;
						i = j;
						break;
					}
				}
			}
		}
		System.out.println(max);
	}
}
