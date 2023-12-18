import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		boolean[] array = new boolean[800];
		Arrays.fill(array, true);
		for (int i = 0; i < n; i++) {
			array[sc.nextInt() + 400] = false;
		}
		int res = -100;
		for (int i = 0; i < 300; i++) {
			if (array[x - i + 400]) {
				res = x - i;
				break;
			}
			if (array[i + x + 400]) {
				res = i + x;
				break;
			}
		}
		System.out.println(res);
	}
}
