import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr=new PrintWriter(System.out);
		String str[]=br.readLine().split(" ");
		Deque<Integer> stack=new ArrayDeque<Integer>();
		int a,b;
		for (int i=0;i<str.length;i++){
			switch(str[i]){
			case "+":
				a=stack.pop();
				b=stack.pop();
				stack.push(b+a);
				break;
			case "-":
				a=stack.pop();
				b=stack.pop();
				stack.push(b-a);
				break;
			case "*":
				a=stack.pop();
				b=stack.pop();
				stack.push(b*a);
				break;
			default:
				stack.push(Integer.parseInt(str[i]));
				break;
			}
		}
		pr.println(stack.pop());
		pr.close();
	}

}