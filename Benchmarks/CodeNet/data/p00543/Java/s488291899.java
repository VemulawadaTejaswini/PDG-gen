import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		for (int i = 2; i <= m; i++) {
		    for (int j = 0; j < n - 1; j++) {
		        if (arr[j] % i > arr[j + 1] % i) {
		            int tmp = arr[j];
		            arr[j] = arr[j + 1];
		            arr[j + 1] = tmp;
		        }
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int x : arr) {
		    sb.append(x).append("\n");
		}
		System.out.print(sb);
	}
}

