import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x, y;
		int answer;
		String str;
		char op;
		boolean bool = true;
		while(bool){
			x = sc.nextInt();
			str = sc.next();
			op = str.charAt(0);
			y = sc.nextInt();
			switch(op){
			case '+':
				answer = x + y;
				System.out.println(answer);
				break;
			case '-':
				answer = x - y;
				System.out.println(answer);
				break;
			case '*':
				answer = x * y;
				System.out.println(answer);
				break;
			case '/':
				if(y == 0){
					System.out.println("Error");
					break;
				}else{
					answer = x / y;
					System.out.println(answer);
					break;
				}
			case '?':
				bool = false;
				break;
			default:
				System.out.println("Error");
			}
		}
	}
}