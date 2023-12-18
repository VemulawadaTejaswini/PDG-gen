import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	Stack<Integer> stack = new Stack<Integer>();
	while(stdin.hasNextInt()){
	    int i = stdin.nextInt();
	    if(i != 0){
		stack.push(i);
	    } else {
		System.out.println(stack.pop());
	    }
	}
    }
}