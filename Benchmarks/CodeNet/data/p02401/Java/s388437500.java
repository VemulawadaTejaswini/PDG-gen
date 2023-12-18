import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			char op = scan.next().charAt(0);
			int b = scan.nextInt();
			
			if(op == '?') {
				break;
			}
			
			if(op == '+') {
				System.out.println(a + b);
			}else if(op == '-') {
				System.out.println(a - b);
			}else if(op == '*') {
				System.out.println(a * b);
			}else if(op == '/') {
				System.out.println(a / b);
			}
			
		}
		
	}

}

