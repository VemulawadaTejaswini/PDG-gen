import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){

			int a = in.nextInt();
			String op = in.next();
			int b = in.nextInt();

			if(op.equals("?"))break;

			int ans = 0;

			switch(op){
			case "+":
				ans = a+b;
				break;
			case "-":
				ans = a-b;
				break;
			case "*":
				ans = a*b;
				break;
			case "/":
				ans = a/b;
				break;
			}

			System.out.println(ans);
		}
	}

}

