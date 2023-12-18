import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			int x=0;
			if(op.equals("?"))break;
			
			if(op.equals("+")){
				x=a+b;
				
			}
			else if(op.equals("-")){
				x=a-b;
				
			}
			else if(op.equals("*")){
				x=a*b;
				
			}
			else if(op.equals("/")){
				x=a/b;
				
			}
			System.out.println(x);

		}
		

	}
}
