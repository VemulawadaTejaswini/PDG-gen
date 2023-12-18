import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();

		int a[] = new int[length];

		for (int i = 0; i < length; i++) {
			a[i] = scan.nextInt();
		}

        for (int i = 0; i < a.length; i++) {
            System.out.print(i + 1 == a.length ? a[i] + "\n" : a[i] + " ");
        }

		// 挿入ソート
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				int temp = a[j];
				a[j] = key;
				a[j + 1] = temp;
				j = j - 1;
			}

            for (int k = 0; k < a.length; k++) {
                System.out.print(k + 1 == a.length ? a[k] + "\n" : a[k] + " ");
            }

		}

	}

}