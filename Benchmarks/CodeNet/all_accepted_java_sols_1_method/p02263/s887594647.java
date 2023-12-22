import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] strArray = br.readLine().split(" ");
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < strArray.length ; i++){
			char input = strArray[i].charAt(0);
			if(Character.isDigit(input)){
				stack.push(Integer.parseInt(strArray[i]));
			}
			else {
				int tmpResult = 0;
				if(input == '+'){
					tmpResult = stack.pop() + stack.pop();
				}
				else if(input == '-'){
					tmpResult = -(stack.pop() - stack.pop());
				}
				else if(input == '*'){
					tmpResult = stack.pop() * stack.pop();
				}	
				//System.out.println(tmpResult);
				stack.push(tmpResult);
			}
		}
		
		System.out.println(stack.pop());
	}

}