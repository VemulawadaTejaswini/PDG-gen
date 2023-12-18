import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
    	@SuppressWarnings("unchecked")
		Stack<String>[] stack = new Stack[num];
    	for(int i = 0 ; i < num ; i++){
    		stack[i] = new Stack<String>();
    	}
    	while(true){
    		String[] st = input.nextLine().split(" ");
    		if(st[0].equals("quit"))break;
    		if(st[0].equals("push")){
    			stack[Integer.parseInt(st[1])-1].push(st[2]);
    		}else if(st[0].equals("pop")){
    			System.out.println(stack[Integer.parseInt(st[1])-1].pop());
    		}else if(st[0].equals("move")){
    			String str = stack[Integer.parseInt(st[1])-1].pop();
    			stack[Integer.parseInt(st[2])-1].push(str);
    		}
    	}
    }
}