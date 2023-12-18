import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> out = new ArrayList<Integer>();
		
		while( true ) {
			n = scan.nextInt();
			
			if(n > 0) {
				stack.push(n);
			}
			
			if(n == 0) {
				out.add(stack.pop());
			}
			
			if( stack.empty() ) {
				break;
			}
			
		}
		
		for(int a : out) {
			System.out.println(a);
		}
	}
}