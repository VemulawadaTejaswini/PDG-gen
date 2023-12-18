import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int maxIdx = 0;
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for (int i = 1; i <= n; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        maxIdx = i;
		    }
		    if (min > x) {
		        min = x;
		        minIdx = i;
		    }
		}
		boolean reverse;
		StringBuilder sb = new StringBuilder();
		if (min >= 0) {
		    sb.append(n - 1).append("\n");
		    reverse = false;
		} else if (max <= 0) {
		    sb.append(n - 1).append("\n");
		    reverse = true;
		} else if (Math.abs(min) <= Math.abs(max)) {
		    sb.append(n * 2 - 1).append("\n");
		    for (int i = 1; i <= n; i++) {
		        sb.append(maxIdx).append(" ").append(i).append("\n");
		    }
		    reverse = false;
		} else {
		    sb.append(n * 2 - 1).append("\n");
		    for (int i = 1; i <= n; i++) {
		        sb.append(minIdx).append(" ").append(i).append("\n");
		    }
		    reverse = true;
		}
		if (reverse) {
		    for (int i = n - 1; i >= 1; i--) {
		        sb.append(i + 1).append(" ").append(i).append("\n");
		    }
		} else {
		    for (int i = 2; i <= n; i++) {
		        sb.append(i - 1).append(" ").append(i).append("\n");
		    }
		}
       System.out.print(sb);
   }
}


