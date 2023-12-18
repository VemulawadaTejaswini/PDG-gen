import java.util.*;

public class Main {
	private Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int num = scan.nextInt();
			if (num != 0) {
				stack.push(num);
			}else {
				System.out.println(stack.pop());
			}
		}
	}
	
	private void debug() {
		System.out.println();
	}

}