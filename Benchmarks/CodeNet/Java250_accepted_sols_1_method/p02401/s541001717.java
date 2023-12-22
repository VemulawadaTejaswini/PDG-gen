import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true){

			int a = Integer.parseInt(scan.next());
			String op = scan.next();
			int b = Integer.parseInt(scan.next());

			int result = 0;

			if(op .equals("+")){
				result = a + b;
			}else if(op.equals("-")){
				result = a - b;
			}else if(op.equals("*")){
				result = a * b;
			}else if(op.equals("/")){
				result = a / b;
			}else if(op.equals("?")){
				break;
			}
			System.out.println(result);
		}
		scan.close();
	}
}