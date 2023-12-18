import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String C[] = new String[N];
		String C1[] = new String[N];
		String C2[] = new String[N];
		for (int i = 0; i < N; i++) {
			C[i] = sc.next();
			C1[i] = C[i];
			C2[i] = C[i];
		}

		BubbleSort(C1);

		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				System.out.println(C1[i]);
			} else {
				System.out.print(C1[i] + " ");
			}
		}

		if (isStable(C, C1)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}

		SelectionSort(C2);

		for (int i = 0; i < N; i++) {
			if (i == N - 1) {
				System.out.println(C2[i]);
			} else {
				System.out.print(C2[i] + " ");
			}
		}

		if (isStable(C, C2)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}

	public static void BubbleSort(String[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = n - 1; j > i; j--) {
				if (a[j - 1].charAt(1) > a[j].charAt(1)) {
					String temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
				}
			}
		}
	}

	public static void SelectionSort(String[] a) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[min].charAt(1) > a[j].charAt(1)) {
					min = j;
				}
			}
			String temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
	}

	public static boolean isStable(String in[], String out[]) {
		int n = in.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int a = 0; a < n; a++) {
					for (int b = a + 1; b < n; b++) {
						if (in[i].charAt(1) == in[j].charAt(1) && in[i].equals(out[b]) && in[j].equals(out[a])) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}
}
