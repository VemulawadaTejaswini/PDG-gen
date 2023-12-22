import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int[] arr2 = arr.clone();
		Arrays.sort(arr2);
		int idx = n / 2 - 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if (arr[i] <= arr2[idx]) {
				sb.append(arr2[idx + 1]);
			} else {
				sb.append(arr2[idx]);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
