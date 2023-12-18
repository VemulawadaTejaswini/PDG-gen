import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double x1, y1, x2, y2;
		Scanner sc = new Scanner(System.in);
		x1 = Double.parseDouble(sc.next());
		y1 = Double.parseDouble(sc.next());
		x2 = Double.parseDouble(sc.next());
		y2 = Double.parseDouble(sc.next()); sc.close();
		double sin = y2 - y1, cos = x2 - x1;
		if (sin != 0) sin *= sin; if (cos != 0) cos *= cos;
		System.out.println(Math.sqrt(sin + cos));
	}
}