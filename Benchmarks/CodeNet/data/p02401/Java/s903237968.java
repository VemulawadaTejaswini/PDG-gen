import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		String op = scan.next();
		int b = scan.nextInt();
		int ans = 0;
		
		while(op != "?")
		{
			switch(op)
			{
				case "+":
					ans = a + b;
					System.out.println(ans);
					break;
				case "-":
					ans = a - b;
					System.out.println(ans);
					break;
				case "*":
					ans = a * b;
					System.out.println(ans);
					break;
				case "/":
					BigDecimal BDans = new BigDecimal(a / b);
					BDans.setScale(-1,BigDecimal.ROUND_DOWN);
					System.out.println(BDans);
				default:
					
					break;
			}
		}
	}

}