import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a, b;
		String op;
		
		while (true){
			a = input.nextInt();
			op = input.next();
			b = input.nextInt();
			if ("?".equals(op))	break;
			if ("+".equals(op))	a += b;
			else if ("-".equals(op))	a -= b;
			else if ("*".equals(op))	a *= b;
			else if ("/".equals(op)){
				if (b != 0)	a /= b;
				else a = 0;
			}
			System.out.println(a);
		}
	}
}