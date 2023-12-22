import java.util.Scanner;

class Main{
	public static void main(String[] args) 	{
		Scanner sc = new Scanner(System.in);
		while(0 < 1) {
			int num1 = sc.nextInt();
			String str = sc.next();
			int num2 = sc.nextInt();
			switch(str.charAt(0)) {
			case '+':
				System.out.println(num1 + num2);
				break;
			case '-':
				System.out.println(num1 - num2);
				break;
			case '*':
				System.out.println(num1 * num2);
				break;
			case '/':
				System.out.println(num1 / num2);
				break;
			default:
				break;
		}
		if(str.charAt(0) == '?') break;
		}
		sc.close();
	}	
}
