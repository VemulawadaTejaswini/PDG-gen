import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int[] a = new int[n + 1];
		//a[0] =0;
		int flag = 1;
		int count = 0;

		for (int i = 1; i < n + 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 1; i < n + 1; i++) {
			if (flag == 2) {
				break;
			}
			flag = a[flag];
			count++;
		}
		if (flag != 2) {
			count = -1;
		}
		System.out.println(count);

	}
}