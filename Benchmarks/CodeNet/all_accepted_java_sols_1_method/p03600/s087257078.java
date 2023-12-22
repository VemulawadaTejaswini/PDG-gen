import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] next = new int[n][n];
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        next[i][j] = sc.nextInt();
		    }
		}
		long total = 0;
		for (int i = 0; i < n - 1; i++) {
		    for (int j = i + 1; j < n; j++) {
		        boolean flag = false;
		        for (int k = 0; k < n; k++) {
		            if (i == j || j == k || i == k) {
		                continue;
		            }
		            if (next[i][j] > next[i][k] + next[k][j]) {
		                System.out.println(-1);
		                return;
		            } else if (next[i][j] == next[i][k] + next[k][j]) {
		                flag = true;
		            }
		        }
		        if (!flag) {
		            total += next[i][j];
		        }
		    }
		}
        System.out.println(total);
   }
}


