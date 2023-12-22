import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		//台形の計算式
		int trapezoid = (a+b)*h/2;
		System.out.println(trapezoid);
	}

}
