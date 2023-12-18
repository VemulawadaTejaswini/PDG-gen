
import java.util.*;


public class Main {

	private class MyStack {
		Stack<String> stack;

		public MyStack() {
			this.stack = new Stack<String>();
		}

		public Stack<String> getStack() {
			return stack;
		}

		public void setStack(Stack<String> stack) {
			this.stack = stack;
		}

	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyStack [] stack = new MyStack[n+1];
		for(int i=1; i < n+1; i++){
			stack[i] = new MyStack();
		}
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				int num = sc.nextInt();
				String block = sc.next();
				stack[num].getStack().push(block);
			}
			else if(cmd.equals("pop")){
				int num = sc.nextInt();
				System.out.println(stack[num].getStack().pop());
			}
			else if(cmd.equals("move")){
				int from = sc.nextInt();
				int to = sc.nextInt();
				String moveBlock = stack[from].getStack().pop();
				stack[to].getStack().push(moveBlock);
			}
			else if(cmd.equals("quit")){
				break;
			}
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}