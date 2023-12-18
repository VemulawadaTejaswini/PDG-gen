import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			
			if(str.equals(".")){
				break;
			}
			
			char[] input = str.toCharArray();
			
//			System.out.println(str);
			if(balanced(input)){
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
	}
	
	static boolean balanced(char[] input){
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < input.length ; i++){
			char c = input[i];
			
			if(c == '(' || c == '['){
				stack.push(c);
			}
			
			else if(c == ')'){
				if(stack.isEmpty() || stack.peek() != '('){
					return false;
				}
				stack.pop();
			}
			
			else if(c == ']'){
				if(stack.isEmpty() || stack.peek() != '['){
					return false;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty()){
			return true;
		}
		else {
			return false;
		}
	}

}