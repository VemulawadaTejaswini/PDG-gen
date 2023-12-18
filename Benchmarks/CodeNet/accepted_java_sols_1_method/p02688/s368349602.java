import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		boolean[] array = new boolean[n];
		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				array[sc.nextInt() - 1] = true;
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (!array[i]) {
				++count;
			}
		}
		System.out.println(count);
	}
}
