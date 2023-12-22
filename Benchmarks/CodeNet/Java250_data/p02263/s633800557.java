import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    LinkedList<String> stack = new LinkedList<String>();
		
		try {
			String[] param = in.readLine().split(" ");
			
			int i = 0;
			while (i < param.length) {
				while ((param[i].equals("+") == false)
						&& (param[i].equals("-") == false) && (param[i].equals("*") == false)) {
					stack.push(param[i]);
					i++;
				}
				int b = Integer.parseInt(stack.pop());
				int a = Integer.parseInt(stack.pop());
				
				if (param[i].equals("+")) {
					stack.push(String.valueOf(a + b));
				} else if (param[i].equals("-")) {
					stack.push(String.valueOf(a - b));
				} else {
					stack.push(String.valueOf(a * b));
				}
				i++;
			}
			
			System.out.println(stack.pop());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}