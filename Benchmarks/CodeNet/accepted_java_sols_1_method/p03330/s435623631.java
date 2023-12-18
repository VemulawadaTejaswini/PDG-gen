import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();
		int[][] table = new int[c + 1][c + 1];
		for (int i = 1; i <= c; i++) {
		    for (int j = 1; j <= c; j++) {
		        table[i][j] = sc.nextInt();
		    }
		}
		ArrayList<Integer>[] lists = new ArrayList[3];
		for (int i = 0; i < 3; i++) {
		    lists[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= n; i++) {
		    for (int j = 1; j <= n; j++) {
		        lists[(i + j) % 3].add(sc.nextInt());
		    }
		}
		int[][] order = new int[3][c];
		for (int i = 0; i < 3; i++) {
		    for (int j = 1; j <= c; j++) {
		        int sum = 0;
		        for (int x : lists[i]) {
		            sum += table[x][j];
		        }
		        order[i][j - 1] = sum;
		    }
		}
		long min = Long.MAX_VALUE;
		for (int i = 0; i < c; i++) {
		    for (int j = 0; j < c; j++) {
		        if (i == j) {
		            continue;
		        }
		        for (int k = 0; k < c; k++) {
		            if (i == k || j == k) {
		                continue;
		            }
		            min = Math.min(min, order[0][i] + order[1][j] + order[2][k]);
		        }
		    }
		}
	    System.out.println(min);
   }
}


