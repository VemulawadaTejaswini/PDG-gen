import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		char prev = 'X';
		char[] arr = sc.next().toCharArray();
		int sum = 0;
		int count = 1;
		for (int i = 0; i < n; i++) {
			if (prev == arr[i]) {
				count++;
			} else {
				sum += count - 1;
				count = 1;
			}
			prev = arr[i];
		}
		sum += count - 1;
		System.out.println(Math.min(n - 1, sum + 2 * k));
	}
}
