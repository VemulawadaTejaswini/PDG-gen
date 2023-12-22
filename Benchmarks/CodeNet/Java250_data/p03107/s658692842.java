import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int length = arr.length;
		ArrayDeque<Boolean> stack = new ArrayDeque<>();
		for (char c : arr) {
		    boolean b = (c == '0');
		    if (stack.size() == 0 || stack.peek() == b) {
		        stack.push(b);
		    } else {
		        stack.pop();
		    }
		}
		System.out.println(length - stack.size());
	}
}
