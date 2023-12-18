import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < q; i++) {
		    arr[sc.nextInt() - 1]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int x : arr) {
		    if (x + k - q > 0) {
		        sb.append("Yes");
		    } else {
		        sb.append("No");
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}
