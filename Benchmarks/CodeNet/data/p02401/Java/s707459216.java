import java.util.Scanner;

public class Main{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		while(true){
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String op = sc.next();
		
		if(op == ("+"))
			System.out.printf("%d/n", a + b);
		else if(op == ("-"))
			System.out.printf("%d/n", a - b);
		else if(op == ("*"))
			System.out.printf("%d/n", a * b);
		else if(op == ("/"))
			System.out.printf("%d/n", a / b);
		else if(op == ("?"))
			return;
		}
	}
}