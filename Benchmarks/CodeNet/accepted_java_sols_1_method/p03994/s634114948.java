import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int k = sc.nextInt();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 'a') {
				continue;
			}
			int x = 26 - (arr[i] - 'a');
			if (x <= k) {
				arr[i] = 'a';
				k -= x;
			}
		}
		arr[arr.length - 1] = (char)((arr[arr.length - 1] - 'a' + k) % 26 + 'a');
		System.out.println(arr);
	}
}
