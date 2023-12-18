import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    int begin = sc.nextInt();
		    int end = sc.nextInt();
		    int size = end - begin;
		    int[] tmp = new int[size];
		    System.arraycopy(arr, begin, tmp, 0, size);
		    for (int j = 0; j < size; j++) {
		        arr[begin + j] = tmp[size - j - 1];
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}

