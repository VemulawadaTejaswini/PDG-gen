import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[][] field = new boolean[n][n];
		for (int i = 0; i < n; i++) {
		    int from = sc.nextInt() - 1;
		    int count = sc.nextInt();
		    for (int j = 0; j < count; j++) {
		        field[from][sc.nextInt() - 1] = true;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        if (j > 0) {
		            sb.append(" ");
		        }
		        if (field[i][j]) {
		            sb.append("1");
		        } else {
		            sb.append("0");
		        }
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}

