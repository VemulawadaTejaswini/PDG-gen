import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayDeque <String> deque = new ArrayDeque<String>();
		while(true) {
			String inst = stdIn.next();
			if(inst.equals("push")) {
				String op = stdIn.next();
				deque.push(op);
			}
			else if(inst.equals("pop")) {
				System.out.println(deque.pop());
			}
			else {
				break;
			}
		}
	}

}