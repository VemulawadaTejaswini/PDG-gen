import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder s = new StringBuilder(scanner.next());
		Deque<String> stack = new ArrayDeque<>();
		for(int i=0; i<s.length(); i++) {
			if(stack.size()==0) {
				stack.push(s.substring(i, i+1));
			}
			else {
				if(!stack.peek().equals(s.substring(i, i+1))) {
					stack.pop();
				}
				else {
					stack.push(s.substring(i, i+1));
				}
			}
		}

		System.out.println(s.length()-stack.size());
		scanner.close();
	}
}