import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		while(in.hasNext()) {
			int tmp = in.nextInt();
			if(tmp == 0) System.out.println(stack.pop());
			else stack.push(tmp);
		}
		
	}

}