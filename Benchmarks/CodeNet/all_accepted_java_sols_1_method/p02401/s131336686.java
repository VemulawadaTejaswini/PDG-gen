import java.util.Scanner;

public class Main {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
	
		for(;scan.hasNext();){
			int a = 0,b=0;
			
			a = scan.nextInt();
			String op = scan.next();
			b = scan.nextInt();
			
//			a = Integer.parseInt(args[i]);
//			b = Integer.parseInt(args[i+2]);
			if(op.equals("+")){
				System.out.println(a+b);
			}
			if(op.equals("-")){
				System.out.println(a-b);
			}
			if(op.equals("*")){
				System.out.println(a*b);
			}
			if(op.equals("/")){
				System.out.println(a/b);
			}
			if(op.equals("?")){
				break;
			}
		}
	}
}

