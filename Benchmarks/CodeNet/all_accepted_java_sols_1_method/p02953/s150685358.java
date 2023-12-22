import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];
		arr[0] = -1;
		for(int i = 1; i < n+1; i++) {
			arr[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		String ans = "Yes";
		for (int i = 1; i < n; i++) {
			if (arr[i] <= arr[i+1] - 1) {
				arr[i+1]--;
			}
			else if (arr[i] <= arr[i+1]) {
				continue;
			}
			else {
				ans = "No";
				break;
			}
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(ans);
	}
}
