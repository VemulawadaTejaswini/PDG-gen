import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int[] counts = new int[n + 1];
		for (int i = 2; i <= n; i++) {
		    counts[i] = counts[i - 1];
		    if (arr[i - 2] == 'A' && arr[i - 1] == 'C') {
		        counts[i]++;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
		    int count = - counts[sc.nextInt()] + counts[sc.nextInt()];
		    sb.append(count).append("\n");
		}
		System.out.print(sb);
   }
}
