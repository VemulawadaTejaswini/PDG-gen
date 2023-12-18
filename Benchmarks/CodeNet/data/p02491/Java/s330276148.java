import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a,b;
		int d,r;
		double f;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		d = a/b;
		r = a%b;
		f = 1.0 * a / b;
		System.out.println(d + " " + r + " " + f);

	}

}