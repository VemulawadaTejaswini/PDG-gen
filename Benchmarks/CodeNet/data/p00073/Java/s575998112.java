import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner stdin = new Scanner(System.in);
		String data = null;
		double x = 0;
		double h = 0;
		double s = 0;
		while(stdin.hasNext()) {

			x = stdin.nextDouble();
			h = stdin.nextDouble();
			if(x == 0 && h == 0)
				break;
			s = x * Math.sqrt(4 * h * h + x * x) + x * x;
			System.out.println(s);
		}
	}
}