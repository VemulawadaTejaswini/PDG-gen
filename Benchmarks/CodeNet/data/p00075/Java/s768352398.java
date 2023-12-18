import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useDelimiter("(\\s|,)+");
		String a;
		while (in.hasNext()) {
			String num = in.next();
			double w = in.nextDouble();
			double h = in.nextDouble();
			if (25 <= w / (h * h)) {
				System.out.println(num);
			}
		}
	}
}