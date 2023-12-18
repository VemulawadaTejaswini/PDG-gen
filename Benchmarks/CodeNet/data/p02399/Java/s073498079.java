import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextfloat();
		float b = sc.nextfloat();
		
		int one = (int)(a / b);
		int two = a % b;
		float three = (float)a / (float)b;
		
		System.out.println((int)(a / b) + " " + a % b + " " + (a/b));
		
		//有効数字問題があるかもしれない

		
				
	}
}

