import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = "";
		String[] data = new String[3];
		Double a = 0.0;
		Double b = 0.0;
		int C = 0;
		Double another_line = 0.0; // 三角形のもう1辺
		Double S = 0.0; // 三角形の面積
		Double L = 0.0; // 三角形の3辺の合計
		Double h = 0.0; // aを底辺としたときの高さ

		input = sc.nextLine();
		data = input.split(" ");
		a = Double.parseDouble(data[0]);
		b = Double.parseDouble(data[1]);
		C = Integer.parseInt(data[2]);

		// もう1辺を求める
		another_line = Math.sqrt(a * a + b * b - a * b
				* Math.cos(Math.toRadians(C))); // 余弦定理c^2=a^2+b^2-ab*cosCより

		// 面積を求める
		S = a * b * Math.sin(Math.toRadians(C)) * 0.5; // S=1/2*(ab)*sinCより

		// 3辺の合計を求める
		L = a + b + another_line;

		h = 2 * S / a;

		System.out.printf("%.5f", S);
		System.out.println();
		System.out.printf("%.5f", L);
		System.out.println();
		System.out.printf("%.5f", h);
	}

}

