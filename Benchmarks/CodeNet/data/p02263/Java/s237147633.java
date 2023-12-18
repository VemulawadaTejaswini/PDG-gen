import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		String str = "";
		while(sc.hasNext()){
			str = sc.next();
			if(str.equals("+")){
				stack.push(stack.pop()+stack.pop());
			}
			else if(str.equals("-")){
				stack.push(stack.pop()-stack.pop());
			}
			else if(str.equals("*")){
				stack.push(stack.pop()*stack.pop());
			}
			else if(str.equals("/")){
				stack.push(stack.pop()/stack.pop());
			}
			else{
				stack.push(Integer.parseInt(str));
			}
		}
		System.out.println(stack.pop());
	}
}