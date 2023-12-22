import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] array = new int[N];
		int[] array_ = new int[N];
		for (int i = 0; i < N; i++) {
			int current = Integer.parseInt(sc.next());
			array[i] = current;
			array_[i] = current;
		}
		sc.close();
		Arrays.sort(array_);
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (array[i] != array_[i]) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}