import java.util.*;

public class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int idx = 1;
    	long ans = 0;
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < h; i++) {
    	    int add = 0;
    	    int left = sc.nextInt();
    	    int right = sc.nextInt();
    	    if (idx >= left && idx <= right) {
    	        add += right + 1 - idx;
    	        idx = right + 1;
    	    }
    	    ans += add + 1;
    	    if (idx > w) {
    	        sb.append(-1);
    	    } else {
    	        sb.append(ans);
    	    }
    	    sb.append("\n");
    	}
    	System.out.print(sb);
    }
}
