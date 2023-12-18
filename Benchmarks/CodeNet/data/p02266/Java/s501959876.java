import java.util.Scanner;
import java.util.Stack;
class Main {
   public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int n = str.length();
		
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		Stack<Integer> stack3 = new Stack<Integer>();
		
		int j;
		int temp;
		int delete;
		int total = 0;
		for(int i = 0; i < n; i++){
			
			if(str.charAt(i) == '\\'){
				stack1.add(i);
			}else if((str.charAt(i) == '/') && !stack1.isEmpty()){
				j = stack1.pop();
				temp = i - j;
				total += temp;
				while(!stack2.isEmpty() && stack2.get(stack2.size() - 1) > j){
					temp += stack3.pop();
					delete =  stack2.pop();
				}
				stack2.add(j);
				stack3.add(temp);
			}
		}
		System.out.println(total);
		System.out.print(stack3.size() + " ");
		
		for(int x = 0; x < stack3.size(); x++){
			if(x != stack3.size() - 1){
				System.out.print(stack3.get(x) + " ");
			}else{
				System.out.println(stack3.get(x));
			}
		}
	}
}