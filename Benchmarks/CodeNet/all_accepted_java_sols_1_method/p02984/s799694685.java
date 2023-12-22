import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dams = new int[n];
		long[] rains = new long[n];
		for (int i = 0; i < n; i++) {
		    dams[i] = sc.nextInt();
		    if (i % 2 == 0) {
		        rains[0] += dams[i];
		    } else {
		        rains[0] -= dams[i];
		    }
		}
		StringBuilder sb = new StringBuilder();
		sb.append(rains[0]);
		for (int i = 1; i < n; i++) {
		    rains[i] = 2 * dams[i - 1] - rains[i - 1];
		    sb.append(" ").append(rains[i]);
		}
		System.out.println(sb);
   }

}
