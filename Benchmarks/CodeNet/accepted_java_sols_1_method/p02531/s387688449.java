import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		Stack<String> stack=new Stack<String>();
		List<String> list=new ArrayList<String>();
		while(true){
			String[] command=scanner.nextLine().split(" ");
			if(command[0].equals("quit")){
				break;
			}else if(command[0].equals("pop")){
				list.add(stack.pop());
			}else if(command[0].equals("push")){
				stack.push(command[1]);
			}
		}

		for(String s:list){
			System.out.println(s);
		}
	}
}