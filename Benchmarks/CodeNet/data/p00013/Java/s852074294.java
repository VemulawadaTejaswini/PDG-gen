import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayDeque<String> stack = new ArrayDeque<String>();
		ArrayDeque<String> queue = new ArrayDeque<String>();
		while(scan.hasNext()) {
			String input = scan.next();
			if(input.equals("0")) {
				queue.add(stack.pop());
			}else if(input.equals("end")) {
				break;
			}else {
				stack.push(input);
			}
		}
		for(String value : queue) {
			System.out.println(value);
		}
		scan.close();
	}
}

