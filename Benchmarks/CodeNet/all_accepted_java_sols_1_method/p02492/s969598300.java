import java.util.Scanner;


class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		while (true){
			
			int a = input.nextInt();
			String op = input.next();
			
			if (op.equals("?"))return;
			
			int b = input.nextInt();
			
			if (op.equals("+"))System.out.println((a + b));
			else if (op.equals("-"))System.out.println((a - b));
			else if (op.equals("*"))System.out.println((a * b));
			else System.out.println((a / b));
		}
	}
}