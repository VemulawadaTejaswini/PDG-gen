import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			int a = in.nextInt();
			char op = in.next().charAt(0);
			int b = in.nextInt();
			if(op == '+'){
				System.out.println(a + b);
			}
			else if(op == '-'){
				System.out.println(a - b);
			}
			else if(op == '*'){
				System.out.println(a * b);
			}
			else if(op == '/'){
				if(b == 0)break;
				System.out.println(a / b);
			}
			else break;
		}
	}
}