import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String[] array = scan.nextLine().split(" ");
		Stack<String> stack = new Stack<>();
		
		for(int i = 0; i < array.length; i++) {
			try {
				stack.push(String.valueOf(Integer.parseInt(array[i])));
			
			
			}catch(NumberFormatException e){
				int x = Integer.parseInt(stack.pop());
				int y = Integer.parseInt(stack.pop());
		           
				if(array[i].equals("+")) {
					stack.push(String.valueOf(y+x));
				} else if(array[i].equals("-")) {
					stack.push(String.valueOf(y-x));
					} else if(array[i].equals("*")) {
						stack.push(String.valueOf(y*x));
					} else if(array[i].equals("/")) {
						stack.push(String.valueOf(y/x));
					}
		    }    
			//System.out.println(stack);
		}
		System.out.println(stack.pop());
	}
}
