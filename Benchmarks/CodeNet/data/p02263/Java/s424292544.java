import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main{

	public static void reversePolishNotation() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] characters = line.split(" ");
		
		Stack<Integer> numbers = new Stack<Integer>();
		
		for(int i = 0; i < characters.length; i++) {
			//if i is a number
			try {
				int number = Integer.parseInt(characters[i]);
				numbers.push(number);
			//if i is an operator
			}catch(Exception NumberFormatException) {
				int x = numbers.pop();
				int y = numbers.pop();
				String operator = characters[i];
				if(operator.equals("+")) {
					numbers.push(y + x);
				}else if(operator.equals("-")) {
					numbers.push(y - x);
				}else if(operator.equals("*")) {
					numbers.push(y * x);
				}else if(operator.equals("/")) {
					numbers.push(y / x);
				}
			}
		}
		System.out.println(numbers.pop());
	}
	
	public static void main(String[] args) {
		reversePolishNotation();
	}
}
