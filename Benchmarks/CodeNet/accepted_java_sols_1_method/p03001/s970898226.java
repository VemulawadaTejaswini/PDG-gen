
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double w = in.nextInt();
		double h = in.nextInt();
		double x = in.nextInt();
		double y = in.nextInt();

		double s = h * w / 2;

		int p = (x == w / 2 && y == h / 2) ? 1 : 0;

		System.out.println(s);
		System.out.println(p);
	}

}
