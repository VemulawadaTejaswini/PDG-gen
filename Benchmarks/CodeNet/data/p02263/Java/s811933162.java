import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> numbers = new Stack<>();
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		in.close();
		String[] list = line.split(" ");
		for (String l : list) {
			if (l.equals("+") || l.equals("-") || l.equals("*")) {
				int b = numbers.pop();
				int a = numbers.pop();
				if (l.equals("+")) {
					numbers.push(a + b);
				}
				else if (l.equals("-")) {
					numbers.push(a - b);
				}
				else if (l.equals("*")) {
					numbers.push(a * b);
				}
			}
			else {
				int x = Integer.parseInt(l);
				numbers.push(x);
			}
		}
		System.out.println(numbers.pop());
	}
}

