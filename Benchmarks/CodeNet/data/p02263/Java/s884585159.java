import java.util.Scanner;
public class Main {
	public static int top = 0;
	public static int[] stack = new int[10000];
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a, b;
		String[] s = (sc.nextLine()).split(" ");
		
		for(int i = 0; i < s.length; i++){
			if(s[i].equals("+")){
				a = pop();
				b = pop();
				push(b + a);
			}
			else if(s[i].equals("-")){
				a = pop();
				b = pop();
				push(b - a);
			}
			else if(s[i].equals("*")){
				a = pop();
				b = pop();
				push(b * a);
			}
			else{
				push(Integer.parseInt(s[i]));
			}
		}
		System.out.println(pop());
	}
	
	public static void push(int x){
		stack[++top] = x;
	}
	
	public static int pop(){
		top--;
		return stack[top+1];
	}
}
