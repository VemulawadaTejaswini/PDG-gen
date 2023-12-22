
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ="";
		Stack<Integer> stack = new Stack<Integer>();
		while((line = br.readLine()) !=null){
			int input = Integer.parseInt(line);
			if(input != 0){
				stack.push(input);
			}else{
				System.out.println(stack.pop());
			}
		}
	}

}