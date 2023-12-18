
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] s = reader.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		boolean flag = true;
		int i = 0;
		int sum = 0;
		while (flag) {
			flag = false;
			for (int j = n - 1; j >= i + 1; j--) {
				if (a[j] < a[j - 1]) {
					sum++;
					int temp = a[j];
					a[j] = a[j - 1];
					a[j - 1] = temp;
					flag = true;
				}
			}
			i++;
		}
		for (int k = 0; k < n; k++) {
			if (k > 0)
				System.out.print(" ");
			System.out.print(a[k]);
		}
		System.out.println();
		System.out.println(sum);

	}
}