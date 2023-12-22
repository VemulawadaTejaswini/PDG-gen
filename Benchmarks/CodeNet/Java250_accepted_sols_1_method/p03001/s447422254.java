import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		double area = (double) w * (double) h / 2.0;
		int way = w / 2.0 == x && h / 2.0 == y ? 1 : 0;
		System.out.println(area + " " + way);
	}

}
