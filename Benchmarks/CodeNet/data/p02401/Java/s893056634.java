import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b;
		String op;

		Scanner sc = new Scanner(System.in);

		while(true) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();

			if(op.equals("?")) break;

			switch (op) {
	    		case "+":
	    			System.out.println(a+b);
	    			break;
	    		case "-":
	    			System.out.println(a-b);
	    			break;
	    		case "*":
	    			System.out.println(a*b);
	    			break;
	    		case "/":
	    			System.out.println(a/b);
	    			break;
			}
		}
	}
}
