import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	int result = 0;
	while (true) {
	    int a = s.nextInt();
	    String op = s.next();
	    int b = s.nextInt();
	    if (op.equals("?")) break;
	    switch (op) {
	        case "+":
		    result = a + b;
		    break;
		case "-":
                    result = a - b;
		    break;
	        case "*":
		    result = a * b;
		    break;
	        case "/":
		    result = a / b;
		    break;
	    }
	    System.out.println(result);
	}
    }
}
