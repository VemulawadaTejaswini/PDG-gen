
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Stack<Integer> pol = new Stack<Integer>();
		String start = in.nextLine();
		Scanner in2 = new Scanner(start);
		int total = 0;
		while(in2.hasNext()) {
			if(in2.hasNextInt()) {
				pol.push(in2.nextInt());
			} else {
				String op = in2.next();
				if(op.equals("+")) {
					int second = pol.pop();
					int first = pol.pop();
					total = first + second;
					pol.push(total);
				} else if(op.equals("-")) {
					int second = pol.pop();
					int first = pol.pop();
					total = first - second;
					pol.push(total);
				} else if(op.equals("*")) {
					int second = pol.pop();
					int first = pol.pop();
					total = first * second;
					pol.push(total);
				} else if(op.equals("/")) {
					int second = pol.pop();
					int first = pol.pop();
					total = first / second;
					pol.push(total);
				}
			}
		}
		System.out.println(total);
		in.close();
		in2.close();
	}
}

