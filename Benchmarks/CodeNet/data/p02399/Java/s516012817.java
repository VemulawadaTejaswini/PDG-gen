import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner in = new Scanner(System.in);

		double a = in.nextDouble();
		double b = in.nextDouble();

		System.out.print((int)(a/b) + " " + (int)(a%b) + " ");
		System.out.printf("%f", (a/b));


	}

}

