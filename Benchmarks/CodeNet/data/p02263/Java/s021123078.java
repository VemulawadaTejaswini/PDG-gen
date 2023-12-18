import java.util.Scanner;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		Stack<Integer> stack = new Stack<Integer>();
		int x = 0;
		int y = 0;
		int tmp = 0;
		
		for(int i = 0; i < str.length(); i++){
			switch(str.charAt(i))
			{
				case '+':
					x = stack.pop();
					y = stack.pop();
					stack.add(y + x);
					break;
				case '-':
					x = stack.pop();
					y = stack.pop();
					stack.add(y - x);
					break;
				case '*':
					x = stack.pop();
					y = stack.pop();
					stack.add(y * x);
					break;
				case '/':
					x = stack.pop();
					y = stack.pop();
					stack.add(y / x);
					break;
				case ' ':
					break;
				default:
					tmp = str.charAt(i) - '0';
					stack.push(tmp);
			}
		}
		System.out.println(stack.pop());
	}
}