import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	String op= s.next();
	int b = s.nextInt();
	
	while(op.equals("?")==false){
		if(op.equals("+")){
			System.out.println(a+b);
		}else if(op.equals("-")){
			System.out.println(a-b);
		}else if(op.equals("*")){
			System.out.println(a*b);
		}else if(op.equals("/")){
			System.out.println(a/b);
		}
		a = s.nextInt();
		op = s.next();
		b = s.nextInt(); 
	}
	}
}