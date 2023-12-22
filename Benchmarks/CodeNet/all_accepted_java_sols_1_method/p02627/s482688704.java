import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char x = a.charAt(0);
		if(x>='A'&&x<='Z') {
			System.out.println('A');
		}
		else {
			System.out.println('a');
		}
	}
}