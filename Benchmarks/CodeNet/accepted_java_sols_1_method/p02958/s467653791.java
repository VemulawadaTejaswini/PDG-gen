import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		int[] array_sort = new int[n];
		int p;
		int count = 0;
		String str = "YES";
		for (int i = 0; i < n; i++) {
			p = scan.nextInt();
			array[i] = p;
			array_sort[i] = p;
		}
		Arrays.sort(array_sort);
		for (int i = 0; i < n; i++) {
			if (array[i] != array_sort[i]) {
				count++;
				if (count == 3) {
					str = "NO";
					break;
				}
			}
		}
		System.out.println(str);

	}
}
