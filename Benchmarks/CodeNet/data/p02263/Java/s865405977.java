import java.util.Scanner;

class Stack {
	private int top;
	private int[] a;
	
	Stack(){
		this.top=0;
		this.a=new int[200];
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
			if(Character.isDigit(str.charAt(0))){
				S.push(Integer.parseInt(str));
			}
			else {
				int a=S.pop(); int b=S.pop();
				switch(str.charAt(0)){
					case '+':S.push(b+a);
							 break;
					case '-':S.push(b-a);
							 break;
					case '*':S.push(b*a);
							 break;
				}
			}
		}
		System.out.println(S.pop());
	}
}
