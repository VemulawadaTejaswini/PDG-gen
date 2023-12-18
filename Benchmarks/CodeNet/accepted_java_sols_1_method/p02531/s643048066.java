import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	Stack<String> stack = new Stack<String>();
    	while(true){
    		String[] st = input.nextLine().split(" ");
    		if(st[0].equals("quit"))break;
    		if(st[0].equals("push")){
    			stack.push(st[1]);
    		}else if(st[0].equals("pop")){
    			System.out.println(stack.pop());
    		}
    	}
    }
}