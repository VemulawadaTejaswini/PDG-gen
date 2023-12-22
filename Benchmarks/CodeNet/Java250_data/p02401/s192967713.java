import java.util.Scanner;
public class Main {
	void calc(){
		int a,b,ans;
		a = 0;
		b = 0;
		ans = 0;
		String op="a";
		Scanner s = new Scanner(System.in);
		loop1: while(true){
			a = s.nextInt();
			op = s.next();
			b = s.nextInt();
			switch(op){
			case "+":
				ans = a + b;
				break;
			case "-":
				ans = a - b;
				break;
			case "*":
				ans = a * b;
				break;
			case "/":
				ans = a / b;
				break;
			default:
				break loop1;
			}
			System.out.println(ans);
		}
	}
	public static void main(String args[]){
		Main m = new Main();
		m.calc();
	}
}