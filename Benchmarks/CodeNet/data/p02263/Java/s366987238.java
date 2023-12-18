import java.io.*; 
import java.util.*; 

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		System.out.println(parse(input));
	}
	
	static Integer parse(String input) {
		Stack<Integer> stack = new Stack<Integer>();
		String[] things = input.split(" ");
		for(int i = 0; i < things.length; i++) {
			if(things[i].equals("+")) {
				Integer one = stack.pop();
				Integer two = stack.pop();
				stack.push(one + two);
			} else if(things[i].equals("-")) {
				Integer one = stack.pop();
				Integer two = stack.pop();
				stack.push(two - one);
			} else if(things[i].equals("*")) {
				Integer one = stack.pop();
				Integer two = stack.pop();
				stack.push(one * two);
			} else {
				stack.push(Integer.parseInt(things[i]));
			}
		}
		return stack.pop();
	}

}

