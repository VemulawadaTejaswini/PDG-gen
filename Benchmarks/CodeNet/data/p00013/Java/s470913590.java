import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int n;
		while(in.hasNext()) {
			n = in.nextInt();
			if(n!=0)
				stack.push(n);
			else
				System.out.println(stack.pop());
		}
		in.close();
	}
}
