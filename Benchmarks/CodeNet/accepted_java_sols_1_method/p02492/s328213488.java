import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a, b, res = 0;
		String op;
		
		while (true){
			a = input.nextInt();
			op = input.next();
			b = input.nextInt();
			if ("?".equals(op))  break;
			else {
				if ("+".equals(op))  res = a + b;
				if ("-".equals(op))  res = a - b;
				if ("*".equals(op))  res = a * b;
				if ("/".equals(op))  res = a / b;
			}
			System.out.println(res);
		}
	}
}