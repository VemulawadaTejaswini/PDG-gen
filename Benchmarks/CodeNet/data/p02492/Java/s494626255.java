import java.util.Scanner;

class Main{

	public static void main(String args[]){
		int a=0,b=0,answer=0;
		String op;
		Scanner in = new Scanner(System.in);
		
		while(true){
			a = Integer.parseInt(in.next());
			op = in.next();
			b = Integer.parseInt(in.next());
			
			if(op.equals("?")){
				break;
			}
			
			switch(op){
				case "+":
					answer = a+b;
					break;
				case "-":
					answer = a-b;
					break;
				case "*":
					answer = a*b;
					break;
				case "/":
					answer = a/b;
					break;
			}
			
			System.out.println(""+answer);
		
		}
	
	
	}

}