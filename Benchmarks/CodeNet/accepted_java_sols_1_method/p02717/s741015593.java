import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int wk = 0;

		wk = num1;
		num1 = num2;
		num2 = wk;

		wk = num1;
		num1 = num3;
		num3 = wk;

		System.out.println(num1+" "+num2+" "+num3);
	}
}