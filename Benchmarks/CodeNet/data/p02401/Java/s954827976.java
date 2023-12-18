import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			if(op.equals("?")){break;}
			switch (op) {
			case "+":System.out.println(a + b);break;
			case "-":System.out.println(a - b);break;
			case "*":System.out.println(a * b);break;
			case "/":System.out.println(a / b);break;			
			}
		}
		scanner.close();
	}

}