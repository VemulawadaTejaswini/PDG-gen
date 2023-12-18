import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] counts = new int[n + 1];
	    for (int x = 1; x * x * 6 <= n; x++) {
	        for (int y = x; x * x + y * y * 3 + x * y * 2 <= n; y++) {
	            for (int z = y; x * x + y * y + z * z + x * y + y * z + z * x <= n; z++) {
	                int a = x * x + y * y + z * z + x * y + y * z + z * x;
	                if (x == y && y == z) {
	                    counts[a]++;
	                } else if (x == y || y == z) {
	                    counts[a] += 3;
	                } else {
	                    counts[a] += 6;
	                }
	            }
	        }
	    }
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
		    sb.append(counts[i]).append("\n");
		}
		System.out.print(sb);
	}
}
