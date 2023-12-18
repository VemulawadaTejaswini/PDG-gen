
import java.util.*;
public class Main {

	public class MyStack{
		Stack<String> st;

		public MyStack() {
			this.st = new Stack<String>();
		}

		public Stack<String> getSt() {
			return st;
		}

		public void setSt(Stack<String> st) {
			this.st = st;
		}
	}

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		MyStack [] stack = new MyStack[n+1];
		for(int i=1; i < n + 1; i++){
			stack[i] = new MyStack();
		}
		while(true){
			String cmd = sc.next();
			if(cmd.equals("push")){
				int num = sc.nextInt();
				String block = sc.next();
				stack[num].getSt().push(block);

			}
			else if(cmd.equals("pop")){
				int num = sc.nextInt();
				String temp = stack[num].getSt().pop();
				System.out.println(temp);

			}
			else if(cmd.equals("move")){
				int from = sc.nextInt();
				int to = sc.nextInt();
				String block = stack[from].getSt().pop();
				stack[to].getSt().push(block);

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