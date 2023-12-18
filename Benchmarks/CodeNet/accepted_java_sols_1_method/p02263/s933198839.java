import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
//	static int top;
//	static int MAX;
//	static int S[] = new int[MAX];
//	
//	static void initialize() {
//		top = 0;
//	}
//	
//	static boolean isEmpty() {
//		return top == 0;
//	}
//	
//	static boolean isFull() {
//		return top >= MAX - 1;
//	}
//	
//	static void push(int x) {
//		if(! isFull()) {
//			top++;
//			S[top] = x;
//		}
//	}
//	
//	static int pop(){
//		if(! isEmpty()) {
//			top--;
//			return S[top + 1];
//		}
//		return MAX;
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> s = new ArrayDeque<>();
		String[] t = sc.nextLine().split(" ");
		for(int i = 0; i < t.length; i++) {
			String a = t[i];
			if(a.equals("+")) {
				int x = s.pop();
				int y = s.pop();
				s.push(x + y);
			}
			else if(a.equals("-")) {
				int x = s.pop();
				int y = s.pop();
				s.push(y - x);
			}
			else if(a.equals("*")) {
				int x = s.pop();
				int y = s.pop();
				s.push(x * y);
			}
			else {
				int x = Integer.parseInt(a);
				s.push(x);
			}
		}
		System.out.println(s.pop());
	}
}

