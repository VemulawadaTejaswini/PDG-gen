import java.util.Scanner;

public class Main {
	int a, b;
	String op = "";
	
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while(!op.equals("?")) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(!op.equals("?"))System.out.println(calc(a, op, b));
		}
		sc.close();
	}
	
	int calc(int a, String op, int b) {
		if(op.equals("+")) return a + b;
		if(op.equals("-")) return a - b;
		if(op.equals("*")) return a * b;
		if(op.equals("/")) return a / b;
		return 0;
	}
}

