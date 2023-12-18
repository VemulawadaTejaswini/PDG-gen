import java.util.Scanner;

public class simple_calculator {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
				
			if(op.equals("+")){
				System.out.println(a + op + b );
			}else if(op.equals("-")){
				System.out.println(a + op + b );
			}else if(op.equals("*")){
				System.out.println(a + op + b );
			}else if(op.equals("/")){
				System.out.println(a + op + b );
			}else{
				System.out.println("error");
			}
	}
}