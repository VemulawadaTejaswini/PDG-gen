
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] a = new String[n];
		String[] b = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.next();
			b[i] = a[i];
		}
		scanner.close();
		
		a = bubbleSort(a, n);
		tool(a, n);
		System.out.println("Stable");

		b = selectionSort(b, n);
		tool(b, n);
		
		if (a.equals(b)) {
			System.out.println("Stable");
		} else {
			System.out.println("Not stable");
		}
	}

	static void tool(String[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n - 1]);
	}

	static String[] bubbleSort(String[] a, int n) {
		
		boolean flag = true;
		int i = 0;
		while (flag) {
			flag = false;
			for (int j = n - 1; j > i; j--) {
				if (a[j].charAt(1) < a[j - 1].charAt(1)) {
					String temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					flag = true;
				}
			}
			i++;
		}
		return a;
	}

	static String[] selectionSort(String[] a, int n) {
		
		int minj;
		for (int i = 0; i < n; i++) {
			minj = i;
			for (int j = i; j < n; j++) {
				if (a[j].charAt(1) < a[minj].charAt(1)) {
					minj = j;
				}
			}
			String temp = a[i];
			a[i] = a[minj];
			a[minj] = temp;
		}
		return a;
	}

}