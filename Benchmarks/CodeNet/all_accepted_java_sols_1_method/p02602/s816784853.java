import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i + k < n; i++) {
		    if (arr[i] >= arr[i + k]) {
		        sb.append("No");
		    } else {
		        sb.append("Yes");
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
