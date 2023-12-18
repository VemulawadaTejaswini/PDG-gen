import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		double r = sc1.nextDouble();

		System.out.println(String.format("%.8f", r*r*Math.PI) + " " + String.format("%.8f", 2*r*Math.PI));

		sc1.close();

	}

}
