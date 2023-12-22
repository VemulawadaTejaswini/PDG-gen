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

		while(!op.equals("?"))
		{
			if(op.equals("+"))
			{
				ans = a + b;
				System.out.println(ans);
			}else if(op.equals("-")){
				ans = a - b;
				System.out.println(ans);
			}else if(op.equals("*")){
				ans = a * b;
				System.out.println(ans);
			}else if(op.equals("/")){
				BigDecimal BDans = new BigDecimal(a / b);
				BDans.setScale(0,BigDecimal.ROUND_DOWN);
				System.out.println(BDans);
			}else{
				System.out.println("error");
			}
			
//			switch(op)
//			{
//				case "+":
//					ans = a + b;
//					System.out.println(ans);
//					break;
//				case "-":
//					ans = a - b;
//					System.out.println(ans);
//					break;
//				case "*":
//					ans = a * b;
//					System.out.println(ans);
//					break;
//				case "/":
//					BigDecimal BDans = new BigDecimal(a / b);
//					BDans.setScale(0,BigDecimal.ROUND_DOWN);
//					System.out.println(BDans);
//					break;
//				default:
//					System.out.println("error");
//					break;
//			}
			a = scan.nextInt();
			op = scan.next();
			b = scan.nextInt();
		}
	}

}