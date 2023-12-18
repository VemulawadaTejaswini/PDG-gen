import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Integer> polish = new Stack<Integer>();
		while(input.hasNext()) {
			if(input.hasNextInt())
				polish.push(input.nextInt());
			else {
				String operation = input.nextLine();
				int num1 = polish.pop();
				int num2 = polish.pop();
				if(operation.equals("+"))
					polish.push(num1 + num2);
				if(operation.equals("-"))
					polish.push(num1 - num2);
				if(operation.equals("*"))
					polish.push(num1 * num2);
			}
		}
		System.out.print(polish.pop());
	}
}

