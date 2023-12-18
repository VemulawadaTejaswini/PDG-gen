import java.util.Scanner;

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

public class Main {

	public static void main(String[] args)/* throws IOException*/ {
		Scanner sc = new Scanner(System.in);
		//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
				int a = Integer.parseInt(br.readLine());//数字
				String op = br.readLine();//演算子
				int b = Integer.parseInt(br.readLine());//数字
		

		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();

		//		for(int i =0;;i++)
		switch (op) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println(a / b);
			break;
		case "?":
			break;
		
		}
		}
		}
		
		*/while (true) {
			
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();

			if (op.equals("?")) {
				break;
			}else if (op.equals("+")) {
				System.out.println(a + b);
			
			} else if (op.equals("-")) {
				System.out.println(a - b);
			} else if (op.equals("*")) {
				System.out.println(a * b);
			} else if (op.equals("/")) {
				System.out.println(a / b);
			 
			}
		}
	}
}
