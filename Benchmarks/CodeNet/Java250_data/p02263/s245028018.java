
import java.util.Scanner;
import java.util.Stack;

//a trivial practice to evaluate reverse polish notation

public class Main {
	public static boolean is_operator(String token) {
		return token.equals("+") || token.equals("-") || token.equals("*");
	}
	
	
	public static int eval_simple_exp(int b, int a, String op) {
		if(op.equals("+")) return a + b;
		if(op.equals("-")) return a - b;
		if(op.equals("*")) return a * b;
		
		
		return 0;
	}
	
	
	//without any other validation about the expression's validity
	public static int eval_r_polish(String[] exp) {
		Stack<Integer> oprd_stk =new Stack<Integer>();
		int i = 0;
		
		
		while(i < exp.length) {
			String token = exp[i];
			if(is_operator(token)) {
				oprd_stk.push(eval_simple_exp(oprd_stk.pop(), oprd_stk.pop(), token));
			}else {
				oprd_stk.push(Integer.parseInt(token));
			}
			i++;
		}
		
		return oprd_stk.pop();
	}
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		
		String str_exp = cin.nextLine();
		
		System.out.println(eval_r_polish(str_exp.split(" ")));
		
	}
}