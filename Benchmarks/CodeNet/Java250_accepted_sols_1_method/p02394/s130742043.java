

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		int num5 = scanner.nextInt();
		
		if(num3-num5<0|| num4-num5<0||num3+num5>num1||num4+num5>num2)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}