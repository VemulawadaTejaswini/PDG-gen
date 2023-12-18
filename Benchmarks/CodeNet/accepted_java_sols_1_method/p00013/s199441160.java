import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		Stack<Integer> stack = new Stack<Integer>();
		
		while( scan.hasNextInt() ) {
			n = scan.nextInt();
			
			if(n > 0) {
				stack.push(n);
			}
			
			else if(n == 0) {
				System.out.println(stack.pop());
			}
		}
	}
}