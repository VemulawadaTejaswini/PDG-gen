import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int deg = sc.nextInt();
		double s,l,h;

		s = a * b * Math.sin(deg * Math.PI / 180) / 2;
		l = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(deg * Math.PI / 180));
		h = b * Math.sin(deg * Math.PI / 180);

		System.out.println(s + " " + l + " " + h);
	}

}

