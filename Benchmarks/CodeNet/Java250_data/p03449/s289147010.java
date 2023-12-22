import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[2][n];
		for (int i = 0; i < n; i++) {
		    arr[0][i] = sc.nextInt();
		    if (i != 0) {
		        arr[0][i] += arr[0][i - 1];
		    }
		}
		for (int i = 0; i < n; i++) {
		    if (i == 0) {
		        arr[1][i] = sc.nextInt() + arr[0][i];
		    } else {
		        arr[1][i] = Math.max(arr[1][i - 1], arr[0][i]) + sc.nextInt();
		    }
		}
		System.out.println(arr[1][n - 1]);
	}
}
