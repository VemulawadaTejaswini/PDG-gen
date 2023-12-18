import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String op = sc.nextLine();
		int b = sc.nextInt();

		switch(op){
		case "+":
			System.out.println(a + b);
		case "-":
			System.out.println(a - b);
		case "*":
			System.out.println(a * b);
		case "/":
			System.out.println(a / b);
			
		if(op == "?")break;
		}
		sc.close();
	}
}