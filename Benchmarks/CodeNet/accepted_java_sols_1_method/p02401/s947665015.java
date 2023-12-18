
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		Outer:
			while(true){
				int a = sc.nextInt();
				char b = sc.next().charAt(0);
				int c = sc.nextInt();
				int result = 0;
				switch(b){
				case '+': result = a + c; break;
				case '-': result = a - c; break;
				case '*': result = a * c; break;
				case '/': result = a / c; break;
				case '%': result = a % c; break;
				case '?': break Outer;
				default : continue Outer;
				}
				System.out.println(result);
			}
	}
}


