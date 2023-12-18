import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int num500 = 0;
		int num5 = 0;

		num500 = X / 500;
		num5 = (X % 500) / 5;

		System.out.println(1000*num500+5*num5);
	}
}