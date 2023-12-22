import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int num = input.nextInt();
		ArrayList<Stack<String>> stack = new ArrayList<Stack<String>>();
    	for(int i = 0 ; i < num ; i++){
    		stack.add(new Stack<String>());
    	}
    	while(true){
    		String[] st = input.nextLine().split(" ");
    		if(st[0].equals("quit"))break;
    		if(st[0].equals("push")){
    			stack.get(Integer.parseInt(st[1])-1).push(st[2]);
    		}else if(st[0].equals("pop")){
    			System.out.println(stack.get(Integer.parseInt(st[1])-1).pop());
    		}else if(st[0].equals("move")){
    			String str = stack.get(Integer.parseInt(st[1])-1).pop();
    			stack.get(Integer.parseInt(st[2])-1).push(str);
    		}
    	}
    }
}