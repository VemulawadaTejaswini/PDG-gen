import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		double N = sc.nextDouble();

		double I = Math.ceil(N / 2);
		System.out.println((int)I);
		sc.close();

	}

}
