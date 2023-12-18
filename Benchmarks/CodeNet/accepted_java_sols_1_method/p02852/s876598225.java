import java.util.*;

public class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[] arr = sc.next().toCharArray();
		int max = 0;
		int count = 0;
		for (char c : arr) {
		    if (c == '1') {
		        count++;
		        max = Math.max(max, count);
		    } else {
		        count = 0;
		    }
		}
		if (max >= m) {
		    System.out.println(-1);
		    return;
		}
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int idx = n;
		while (idx > 0) {
		    int next = Math.max(idx - m, 0);
		    while (arr[next] == '1') {
		        next++;
		    }
		    stack.push(idx - next);
		    idx = next;
		}
		boolean isFirst = true;
		StringBuilder sb = new StringBuilder();
		while(stack.size() > 0) {
		    if (!isFirst) {
		        sb.append(" ");
		    }
		    sb.append(stack.pop());
		    isFirst = false;
		}
		System.out.println(sb);
	}
}
