import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int ans;
		ans = 0;
		for(;;){
			int a = scan.nextInt();
			String op = scan.next();
			int b = scan.nextInt();
			if(op.equals("?"))
				break;
			if(op.equals("+"))
				ans = a + b;
			else if(op.equals("-"))
				ans = a - b;
			else if(op.equals("*"))
				ans = a * b;
			else if(op.equals("/"))
				ans = a / b;
		System.out.println(ans);
	}
	}
	}