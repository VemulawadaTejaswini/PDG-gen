
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        String[] strArray = bufferedReader.readLine().split(" ");
	        Stack<Integer> stack = new Stack<Integer>();
	         
	        for(int i = 0; i < strArray.length ; i++){
	            char input = strArray[i].charAt(0);
	            if(Character.isDigit(input)){
	            	// ??°????????´?????????push???????????????
	                stack.push(Integer.parseInt(strArray[i]));
	            }
	            else {
	                int tmp = 0; 
	                switch (input) {
					case '+':
						tmp = stack.pop() + stack.pop();
						break;
					case '-':
						tmp = - (stack.pop() - stack.pop());
						break;
					case '*':
						tmp = stack.pop() * stack.pop();
						break;
					default:
						break;
					}
	                // ????????§?¨??????????????????????push???????????????
	                stack.push(tmp);
	            }
	        }
	         
	        System.out.println(stack.pop());
	    }
	 
	}