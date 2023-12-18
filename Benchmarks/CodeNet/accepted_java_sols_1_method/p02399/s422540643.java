import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int a = src.nextInt();
		int b = src.nextInt();

		int d = a / b;
		int r = a % b;
		double f = (double)a /(double)b;

		System.out.println(String.format("%d %d %.5f",d ,r ,f));
	}
}

