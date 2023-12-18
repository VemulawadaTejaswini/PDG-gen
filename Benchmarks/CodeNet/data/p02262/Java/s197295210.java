import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		shellSort(a, n);
		printArrays(a, n);
	}

	public static int insertionSort(int a[], int n, int g) {
		int v, j = 0, cnt = 0;
		for (int i = g; i < n; i++) {
			v = a[i];
			j = i - g;
			while (j >= 0 && a[j] > v) {
				a[j + g] = a[j];
				j = j - g;
				cnt++;
			}
			a[j + g] = v;
		}
		return cnt;
	}

	public static void shellSort(int a[], int n) {
		int cnt = 0;
		ArrayList<Integer> b = new ArrayList<>();
		for (int h = 1;;) {
			if (h > n)
				break;
			b.add(h);
			h = 3 * h + 1;
		}
		int m = b.size();
		System.out.println(m);
		for (int i = m-1; i >0; i--) {
			System.out.print(b.get(i) + " ");
		}
		System.out.println(b.get(0));

		for (int i = m - 1; i >= 0; i--) {
			cnt += insertionSort(a, n, b.get(i));
		}
		System.out.println(cnt);
	}

	public static void printArrays(int a[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
