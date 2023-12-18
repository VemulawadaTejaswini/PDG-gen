import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String op = sc.nextLine();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(op == "?") break;
			if(op == "+"){
				System.out.println(a + b);
			}else if(op == "-"){
				System.out.println(a - b);
			}else if(op == "*"){
				System.out.println(a * b);
			}else if(op == "/"){
				System.out.println(a / b);
			}
		}
	}
}