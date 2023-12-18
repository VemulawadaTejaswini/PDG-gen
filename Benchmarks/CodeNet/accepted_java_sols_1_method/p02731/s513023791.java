import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		double L = sc.nextDouble();

		double S = L / 3;
		double W = L / 3;
		double H = L / 3;

		System.out.println(S * W * H);
	}
}
