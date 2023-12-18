import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			
			if(op.equals("?")) break;
			
			int sum =0;
			
			switch(op){
			case "+":
				sum = a+b;
				break;
			
			case "-":
				sum = a-b;
				break;
			
			case "*":
				sum = a*b;
				break;
				
			case "/":
				sum = a/b;
				break;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}
