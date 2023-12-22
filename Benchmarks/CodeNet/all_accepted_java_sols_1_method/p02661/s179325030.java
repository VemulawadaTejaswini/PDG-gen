import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arrA = new int[n];
		int[] arrB = new int[n];
		for (int i = 0; i < n; i++) {
		    arrA[i] = sc.nextInt();
		    arrB[i] = sc.nextInt();
		}
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		int count;
		if (n % 2 == 0) {
		    int left = arrA[(n - 1) / 2] + arrA[(n - 1) / 2 + 1];
		    int right = arrB[(n - 1) / 2] + arrB[(n - 1) / 2 + 1];
		    count = Math.max(right - left + 1, 0);
		} else {
		    int left = arrA[n / 2];
		    int right = arrB[n / 2];
		    count = Math.max(right - left + 1, 0);
		}
	    System.out.println(count);
	}
}
