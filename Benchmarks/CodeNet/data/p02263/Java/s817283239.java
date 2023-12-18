import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		String[] str = br.readLine().split(" ");
		int a = 0 ;
		for(int i = 0 ; i < str.length ; i ++){
			if(str[i].equals("+")){
				stack.push(stack.pop()+stack.pop());
			}
			else if(str[i].equals("-")){
				stack.push(-1*stack.pop()+stack.pop());
			}
			else if(str[i].equals("*")){
				stack.push(stack.pop()*stack.pop());
			}
			else if(str[i].equals("/")){
				a = stack.pop();
				stack.push(stack.pop()/a);
			}
			else{
				//System.out.println(str[i]+": push now");
				stack.push(Integer.parseInt(str[i]));
			}
		}
		System.out.println(stack.pop());
	}
}