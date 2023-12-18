import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		sb.append(n).append("\n");
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    int w = sc.nextInt();
		    sb.append(-x).append(" ").append(w).append("\n");
		}
		System.out.print(sb);
	}
}

