import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int regularAns = 0;
		boolean flying = false;
		boolean start = false;
		for(int i = 0; i < n; i++){
			String input = br.readLine();
			if(input.equals("A")){
				stack.push(1);
				start = true;
			}
			else if(!start && input.equals("Un")){
				flying = true;
				break;
			}
			else if(!stack.isEmpty() && input.equals("Un")){
				stack.pop();
				regularAns++;
			}
		}
		
		if(!flying && stack.isEmpty() && regularAns > 0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}

}