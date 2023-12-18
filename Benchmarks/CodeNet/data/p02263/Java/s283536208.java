
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		String[] str=string.split(" ");
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<str.length;i++){
			if(str[i].equals("+")){
				int tmp=stack.pop()+stack.pop();
				stack.push(tmp);
			}
			
			else if(str[i].equals("-")){
				int tmp=stack.pop()-stack.pop();
				stack.push(-tmp);
			}
			else if(str[i].equals("*")){
				int tmp=stack.pop()*stack.pop();
				stack.push(tmp);
			}

			else stack.push(Integer.parseInt(str[i]));
		}
		System.out.println(stack.pop());
	}

}

