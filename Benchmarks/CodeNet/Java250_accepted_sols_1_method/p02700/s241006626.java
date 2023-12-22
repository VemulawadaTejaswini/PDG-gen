import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); //高橋体力
		int b = sc.nextInt(); //高橋攻撃力
		int c = sc.nextInt(); //青木体力
		int d = sc.nextInt(); //青木攻撃力

		double num1 = Math.ceil((double)a / d) + 1;
		double num2 = Math.ceil((double)c / b) + 1;

		if(num2 <= num1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}