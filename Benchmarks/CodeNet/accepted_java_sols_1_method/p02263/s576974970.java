import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> stack = new LinkedList<Integer>();
		String[] tokens = in.nextLine().split(" ");
		int a, b, result;
		for(String t : tokens){
			if(t.matches("[0-9]+")) {
				stack.push(Integer.parseInt(t));
			}else{
				a = stack.pop();
				b = stack.pop();
				result = 0;
				switch(t){
					case "+" : result = b + a;
						       break;
					case "*" : result = b * a;
						       break;
					case "-" : result = b - a;
						       break;
					case "/" : result = b / a;
				}
				stack.push(result);
			}
		}
		System.out.println(stack.pop());
		in.close();
	}
}