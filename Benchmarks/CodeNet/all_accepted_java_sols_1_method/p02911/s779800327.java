import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();
		int[] arr = new int[n + 1];
		for (int i = 0; i < q; i++) {
		    arr[sc.nextInt()]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    if (arr[i] > q - k) {
		        sb.append("Yes");
		    } else {
		        sb.append("No");
		    }
		    sb.append("\n");
		}
		System.out.println(sb);
   }
}
