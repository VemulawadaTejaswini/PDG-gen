import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int a = in.nextInt();
			String op = in.next();
			int b = in.nextInt();
			if(op.equals("?"))break;
			int c = 0;
			switch(op){
			case "+":
				c = a+b;
				break;
			case "-":
				c = a-b;
				break;
			case "*":
				c = a*b;
				break;
			case "/":
				c = a/b;
				break;
			}
			System.out.println(c);
        }
        in.close();
	}
}

