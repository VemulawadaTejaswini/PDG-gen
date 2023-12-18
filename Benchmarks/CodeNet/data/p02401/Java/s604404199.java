import java.util.Scanner;

class Main {
	static int d;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,result;
		String op;
		roup:{
			while(true){
				a = scanner.nextInt();
				op =scanner.next();
				b = scanner.nextInt();

				switch(op){
				case "+":
					result = a+b;
					break;
				case "-":
					result = a-b;
					break;
				case "*":
					result = a*b;
					break;
				case "/":
					result = a/b;
					break;
				default:
					break roup;
				}
				System.out.println(result);
			}
		}

	}
}
