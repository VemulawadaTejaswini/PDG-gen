import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		outer:
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			switch (op){
			case "?":
				break outer;
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			default:
				break;	
			}
		}
	}
}