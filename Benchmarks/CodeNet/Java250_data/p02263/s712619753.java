import java.util.*;

public class Main {
	public static void main(String[] args) {
		ALDS1_3_A();
	}

	public static void ALDS1_3_A() {
		Scanner sc = new Scanner(System.in);
		Deque<String> stack = new ArrayDeque<String>();
		while(sc.hasNext()) {
			String str = sc.next();
			if(str.equals("+")) {
				int a = Integer.parseInt(stack.removeFirst());
				int b = Integer.parseInt(stack.removeFirst());
				String c = Integer.toString(a + b);
				stack.addFirst(c);
			} else if(str.equals("-")) {
				int a = Integer.parseInt(stack.removeFirst());
				int b = Integer.parseInt(stack.removeFirst());
				String c = Integer.toString(b - a);
				stack.addFirst(c);
			} else if(str.equals("*")) {
				int a = Integer.parseInt(stack.removeFirst());
				int b = Integer.parseInt(stack.removeFirst());
				String c = Integer.toString(a * b);
				stack.addFirst(c);
			} else {
				stack.addFirst(str);
			}
		}
		
		System.out.println(stack.removeFirst());
	}
	
}
