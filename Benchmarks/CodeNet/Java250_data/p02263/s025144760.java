import java.util.Scanner;

class Stack {
	private int top;
	private int[] a;
	
	Stack(){
		this.top=0;
		a=new int[200];
	}
	
	void push(int x){
		a[top++]=x;
	}
	
	int pop(){
		top--;
		return a[top];
	}
	
}

class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		Stack S=new Stack();
		
		while(scan.hasNext()){
			String str=scan.next();

			if(str.charAt(0)=='+'){
				int a=S.pop();
				int b=S.pop();
				S.push(b+a);
			}
			else if(str.charAt(0)=='-'){
				int a=S.pop();
				int b=S.pop();
				S.push(b-a);
			}
			else if(str.charAt(0)=='*'){
				int a=S.pop();
				int b=S.pop();
				S.push(b*a);
			}
			else {
				S.push(Integer.parseInt(str));
			}
		}
		System.out.println(S.pop());
	}
}
