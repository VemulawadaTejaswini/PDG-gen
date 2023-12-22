import java.io.*;
import java.util.Arrays;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = (br.readLine()).split(" ");
		Deque<Integer> stack = new ArrayDeque<Integer>();
		for (int i = 0; i<str.length ; i++ ) {
			if (str[i].equals("+")) {
				int	a = stack.pop();
				int	b = stack.pop();
				int	c = a+b;
				stack.push(c);	
			}else if(str[i].equals("-")){
				int	a = stack.pop();
				int	b = stack.pop();
				int	c = b-a;
				stack.push(c);	
			}else if (str[i].equals("*")) {
				int	a = stack.pop();
				int	b = stack.pop();		
				int	c = a*b;
				stack.push(c);	
			}else{
				stack.push(Integer.parseInt(str[i]));
			}
		}
		System.out.println(stack.pop());
	}
}