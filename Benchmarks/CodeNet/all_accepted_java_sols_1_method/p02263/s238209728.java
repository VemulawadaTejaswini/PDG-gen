import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		String[] line =n.split(" ");


		Deque<Integer> stack = new ArrayDeque<Integer>();
		for(int i=0; i<line.length; i++) {
			int a=0,b=0;
			switch(line[i]) {
			case "+":
				a = stack.pop();
				b = stack.pop();
				stack.push(b+a);
				break;
			case "-":
				a = stack.pop();
				b = stack.pop();
				stack.push(b-a);
				break;
			case "/":
				a = stack.pop();
				b = stack.pop();
				stack.push(b/a);
				break;
			case "*":
				a = stack.pop();
				b = stack.pop();
				stack.push(b*a);
				break;
			default:
				a = Integer.parseInt(line[i]);
				stack.push(a);
				break; 
			}
		}
        int ans = stack.pop();
		System.out.println(ans);
	}
}


