import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringBuilder result = new StringBuilder();

		while(true){

			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

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
			result.append(Integer.toString(ans)).append("\n");
		}
		System.out.print(result.toString());
	}
}


