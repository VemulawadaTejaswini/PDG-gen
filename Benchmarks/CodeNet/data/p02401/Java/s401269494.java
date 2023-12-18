import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		while(true){

			int a = scan.nextInt();
			int b = scan.nextInt();
			String op = scan.next();

			if(op == "+"){
				System.out.println(a + b);
			}else if(op == "-"){
				System.out.println(a - b);
			}else if(op == "*"){
				System.out.println(a * b);
			}else if(op == "/"){
				System.out.println(a / b);
			}else if(op == "?"){
				break;
			}
		}
	}
}