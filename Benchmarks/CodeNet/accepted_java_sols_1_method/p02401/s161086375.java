import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int a = stdIn.nextInt();
			String op = stdIn.next();
			int b = stdIn.nextInt();
			if(op.equals("?"))
				break;
			switch (op.charAt(0)) {
				case '+':System.out.println((a+b)); break;
				case '-':System.out.println((a-b)); break;
				case '*':System.out.println(a*b); break;
				case '/':System.out.println(a/b); break;
			}
		}
	}
}