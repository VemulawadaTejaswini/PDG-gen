import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int one = (int)(a / b);
		int two = a % b;
		Double three = (double)a / (double)b;
		
		System.out.println(one + " " + two + " " + three);
		
		//有効数字問題があるかもしれない

		
				
	}
}

