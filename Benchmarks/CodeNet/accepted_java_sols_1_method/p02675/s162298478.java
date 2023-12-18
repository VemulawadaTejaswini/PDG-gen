import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		char n = N.charAt(N.length()-1);

		if(n == '3')
			System.out.println("bon");
		else if(n == '0' || n == '1' || n == '6' || n == '8')
			System.out.println("pon");
		else
			System.out.println("hon");


	}
}
