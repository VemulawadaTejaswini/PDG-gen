import java.util.Scanner;

public class Main {
	static int[] array;

	public static boolean isMake(int m, int i) {
		if (array[i] == m) {
			return true;
		} else {
			if (i == array.length - 1) {
				return false;
			} else {
				return (isMake(m, i + 1)) ||
						(isMake(m - array[i], i + 1));
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			if (isMake(sc.nextInt(), 0)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
