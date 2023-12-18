import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d;
		//f(x) = x*x
		while (in.hasNext()) {
			d = in.nextInt();
			System.out.println(calcAreaXX(d));
		}
		in.close();
	}

	static int calcAreaXX(int d) {
		int area = 0;
		int rect;
		for (int i = d; i < 600; i += d) {
			rect = d * i * i;
			area += rect;
		}
		return area;
	}
}