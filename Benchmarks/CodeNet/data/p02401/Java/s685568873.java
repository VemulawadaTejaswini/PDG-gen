import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
		
			if(a==0&&b==0&&op.equals("?")) break;
			else if(op.equals("+")){
				System.out.println(a+b);
			} else if(op.equals("-")){
				System.out.println(a-b);
			} else if(op.equals("*")){
				System.out.println(a*b);
			} else if(op.equals("/")){
				System.out.println(a/b);
			}
		}
	}
}