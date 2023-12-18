import java.util.Scanner;

public class Main {

	static int keep = 0;
	static int[] num = new int[500];
	
	public static void push(int x){
		keep++;
		num[keep] = x;
	}
	
	public static int pop(){
		keep--;
		return num[keep+1];
	}
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		String lineHold = scan.nextLine();
		
		String[] operations = lineHold.split(" ");
		for (int i = 0; i < operations.length; i++){
			if(operations[i].equals("+")){
				int x = pop();
				int y = pop();
				push(x+y);
			}
			else if (operations[i].equals("-")){
				int x = pop();
				int y = pop();
				push(y-x);
			}
			else if (operations[i].equals("*")){
				int x = pop();
				int y = pop();
				push(x*y);
			}
			else{
				push(Integer.parseInt(operations[i]));
			}
		}
		
		System.out.println(pop());
	}
	
	
}


