import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		String op = sc.next();
		int b=sc.nextInt();
		while(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")){
			if(op.equals("+")){
				System.out.println(a+b);
			}else if(op.equals("-")){
				System.out.println(a-b);
			}else if(op.equals("*")){
				System.out.println(a*b);
			}else if(op.equals("/")){
				System.out.println(a/b);
			}
			a=sc.nextInt();
			op=sc.next();
			b=sc.nextInt();
		}
		// TODO Auto-generated method stub

	}

}