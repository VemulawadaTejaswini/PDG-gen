import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args){
		String str;
		int num1, num2, result = 0;
		Scanner in = new Scanner(System.in);
		Stack<Integer> poland = new Stack<Integer>();

		while(in.hasNext()){
			str = in.next();

			if(str.equals("+") || str.equals("-") || str.equals("*")){
				num1 = poland.pop();
				num2 = poland.pop();
				if(str.equals("+")) result = num2 + num1;
				else if(str.equals("-")) result = num2 - num1;
				else if(str.equals("*")) result = num2 * num1;
				poland.push(result);
			}
			else{
				poland.push(Integer.parseInt(str));
			}
		}
		System.out.println(result);
	}
}