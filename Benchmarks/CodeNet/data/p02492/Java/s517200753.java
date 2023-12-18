import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		while(true){
		int x=stdIn.nextInt();
		String op=stdIn.next();
		int y=stdIn.nextInt();
		if(op.equals("?")) break;
		switch(op){
			case "+":
				System.out.println(x+y);
				break;
			case "-":
				System.out.println(x-y);
				break;
			case "*":
				System.out.println(x*y);
				break;
			case "/":
				System.out.println(x/y);
				break;
		}
		}
	}
}