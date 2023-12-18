

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int top = 0;
	public static List<Integer> stack = new ArrayList<Integer>();

	public static void push(int x) {
		stack.add(x);
		top ++;
	}
	
	public static int pop() {
		top --;
		return stack.remove(top);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		for (String in : inputs) {
			if (in.matches("[0-9]+")) {
				push(Integer.parseInt(in));
			} else {
				int b = pop();
				int a = pop();
				if ("+".equals(in)) 
					push(a+b);
				else if ("-".equals(in)) 
					push(a-b);
				else if ("*".equals(in)) 
					push(a*b);
			}
		}
		sc.close();
		
		System.out.println(pop());
	}

}

