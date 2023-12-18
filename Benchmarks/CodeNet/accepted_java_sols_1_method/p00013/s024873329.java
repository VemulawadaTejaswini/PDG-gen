import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		while(true){
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			int n = Integer.parseInt(tmp);
			
			if(n != 0){
				stack.push(n);
			}
			if(n == 0){
				System.out.println(stack.pop());
			}
		}
	}
}