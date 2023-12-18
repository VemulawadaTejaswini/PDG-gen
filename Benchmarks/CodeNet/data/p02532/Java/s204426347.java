import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		@SuppressWarnings("rawtypes")
		ArrayDeque[] deque = new ArrayDeque[n];
		for(int i = 0; i < n; i++) {
			deque[i] = new ArrayDeque<String>();
		}
		
		
		while(true) {
			String inst = stdIn.next();
			if(inst.equals("push")) {
				int opA = stdIn.nextInt();
				String opB = stdIn.next();
				deque[opA-1].push(opB);
			}
			else if(inst.equals("move")) {
				int opA = stdIn.nextInt();
				int opB = stdIn.nextInt();
				deque[opB-1].push(deque[opA-1].pop());
			}
			else if(inst.equals("pop")) {
				int op = stdIn.nextInt();
				System.out.println(deque[op-1].pop());
			}
			else {
				break;
			}
		}
	}

}