import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private Scanner sc;

	private int p;
	private String line;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int lines = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < lines; i++) {
			line = sc.nextLine();
			
			p = 0;
			System.out.println(expression());
		}
	}

	private int expression() {
		int value = term();
		
		return sub_expression(value);
	}
	
	private int sub_expression(int value) {
		if (line.charAt(p) == '+') {
			p++;
			
			value = value + term();
			value = sub_expression(value);
		} else if (line.charAt(p) == '-') {
			p++;
			
			value = value - term();
			value = sub_expression(value);
		}
		
		return value;
	}
	
	private int term() {
		int value = factor();
		
		return sub_term(value);
	}
		
	private int sub_term(int value) {
		if (line.charAt(p) == '*') {
			p++;
			
			value = value * factor();
			value = sub_term(value);
		} else if (line.charAt(p) == '/') {
			p++;
			
			value = value / factor();
			value = sub_term(value);
		}
		
		return value;
	}
	
	private int factor() {
		int value = 0;
		switch (line.charAt(p)) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			value = Integer.parseInt("" + line.charAt(p));
			p++;
			break;
		case '(':
			p++;
			
			value = expression();
			p++;
			break;
		}
		return value;
	}
}