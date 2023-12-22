import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H[] = new long[N];
		for (int i = 0; i < H.length; i++) {
			H[i] = sc.nextLong();
		}

		long max = H[0];
		for (int i = 0; i < H.length-1; i++) {
			if (max-H[i+1] >1) {
				System.out.println("No");
				return;
			} else if (max == H[i+1]) {
				continue;
			} else if (max-H[i+1] == 1) {
				continue;
			} else {
				max = H[i+1];
			}

		}
		System.out.println("Yes");
	}
}
