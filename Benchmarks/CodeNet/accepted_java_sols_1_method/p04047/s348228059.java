import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[2 * n];
		for (int i = 0; i < 2 * n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int res = 0;
		for (int i = 0; i < 2 * n;) {
			res += arr[i];
			i += 2;
		}
		System.out.println(res);

	}

}
