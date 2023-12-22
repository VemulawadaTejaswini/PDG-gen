import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int i=1, p=0;
		Scanner sc = new Scanner(System.in);
		while(i == 1){
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			switch(op){
				case "+":
					System.out.printf("%d\n", a+b);
					break;
				case "-":
					System.out.printf("%d\n", a-b);
					break;
				case "*":
					System.out.printf("%d\n", a*b);
					break;
				case "/":
					System.out.printf("%d\n", a/b);
					break;
				case "?":
					i = -1;
					break;
			}
		}
	}
}