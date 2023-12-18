import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = 0;
		int start = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			int count = 0;
			boolean setFlag = false;
			for (int j = start; j < n; j++) {
				if (arr[i] - arr[j] > 1) {
					continue;
				}
				if (arr[j] - arr[i] > 1) {
					break;
				}
				count++;
				if (!setFlag) {
					setFlag = true;
					start = j;
				}
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}
