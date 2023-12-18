import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			if (op.equals("?")){
			    break;
			}
			int answer = 0;
			if (op.equals("+")){
			    answer = a + b;
			}else if (op.equals("-")){
			    answer = a - b;
			}else if (op.equals("*")){
			    answer = a * b;
			}else{
			    answer = a / b;
			}
			System.out.println(answer);

		}
	}
}

