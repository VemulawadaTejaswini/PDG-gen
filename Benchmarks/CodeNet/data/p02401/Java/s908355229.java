import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int i,ans;
		String op;
		ans = 0;
		for(;;){
			int a = scan.nextInt();
			op = scan.next();
			int b = scan.nextInt();
			if(op == "?")
				break;
			else if(op == "+"){
				ans = a + b;
				System.out.println(ans);
			}
			else if(op == "-"){
				ans = a - b;
				System.out.println(ans);
			}
			else if(op == "/"){
				ans = a / b;
				System.out.println(ans);
			}
			else if(op == "*"){
				ans = a * b;
				System.out.println(ans);
			}
		}
	}
}