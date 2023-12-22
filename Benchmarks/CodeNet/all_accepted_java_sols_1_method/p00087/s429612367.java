import java.util.*;

public class Main{
	public static void main(String[] args){
		Double a;
		Scanner scan = new Scanner(System.in);

		while(scan.hasNextLine()){
			String[] s = scan.nextLine().split(" ");
			Stack<Double> stack = new Stack<Double>();

			for(int i=0;i<s.length;i++){
				if(s[i].equals("-")){
					a = stack.pop();
					stack.push(stack.pop() - a);
				}
				else if(s[i].equals("/")){
					a = stack.pop();
					stack.push(stack.pop() / a);
				}
				else if(s[i].equals("*")){
					a = stack.pop();
					stack.push(stack.pop() * a);
				}
				else if(s[i].equals("+")){
					a = stack.pop();
					stack.push(stack.pop() + a);
				}
				else
					stack.push(Double.parseDouble(s[i]));
			}

			System.out.printf("%.6f\n",stack.pop());
		}
	}
}