import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if(op == "?")
				break;
			
			if(op == "+")
				System.out.println(a+b);
			if(op == "-")
				System.out.println(a-b);
			if(op == "*")
				System.out.println(a*b);
			if(op == "/")
				System.out.println(a/b);
				
			}
			
	}
}