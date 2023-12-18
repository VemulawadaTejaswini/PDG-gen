import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
		    
		    String[] expression = scanner.nextLine().split(" ");
		    
		    int a = Integer.parseInt(expression[0]);
		    String operation = expression[1];
		    int b = Integer.parseInt(expression[2]);
		    
		    if (operation.equals("?")) {
		        break;
		    }
		    
		    if (operation.equals("+")) {
		        System.out.println(a + b);
		    }
		    
		    if (operation.equals("-")) {
		        System.out.println(a - b);
		    }
		    
		    if (operation.equals("*")) {
		        System.out.println(a * b);
		    }
		    
		    if (operation.equals("/")) {
		        System.out.println(a / b);
		    }
		    
		}
		scanner.close();
	}
}
