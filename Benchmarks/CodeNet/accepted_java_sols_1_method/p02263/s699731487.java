import java.util.Scanner;
import java.util.Stack;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split("\\s");
		
		Stack<Integer> stack = new Stack<Integer>();
		int x = 0;
		int y = 0;
		int tmp = 0;
		
		for(int i = 0; i < str.length; i++){
			if(str[i].equals("+")){
				x = stack.pop();
				y = stack.pop();
				stack.add(y + x);
			}else if(str[i].equals("-")){
				x = stack.pop();
				y = stack.pop();
				stack.add(y - x);
			}else if(str[i].equals("*")){
				x = stack.pop();
				y = stack.pop();
				stack.add(y * x);
			}else if(str[i].equals("/")){
				x = stack.pop();
				y = stack.pop();
				stack.add(y / x);
			}else{
				stack.push(Integer.parseInt(str[i]));
			}
		}
		
		System.out.println(stack.pop());
	}
}