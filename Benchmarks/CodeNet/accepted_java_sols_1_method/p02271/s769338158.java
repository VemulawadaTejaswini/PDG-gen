import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] used = new boolean[2001];
		used[0] = true;
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    for (int j = 2000 - x; j >= 0; j--) {
		        if (!used[j]) {
		            continue;
		        }
		        used[j + x] = true;
		    }
		}
		StringBuilder sb = new StringBuilder();
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
		    int x = sc.nextInt();
		    if (used[x]) {
		        sb.append("yes");
		    } else {
		        sb.append("no");
		    }
		    sb.append("\n");
		}
		System.out.print(sb);
	}
}

