import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double v, t, y;
		int n;

		while(sc.hasNext()){
			v = sc.nextDouble();
			t = v / 9.8;
			y = 4.9 * t * t;

			n = (int)Math.ceil((y + 5) / 5);

			System.out.println(n);
		}
	}
}