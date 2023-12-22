import java.util.Scanner;


public class Main {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			
			
			int c=0;
			switch(op)
			{
				case "?":
					return;
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
		
	}
}