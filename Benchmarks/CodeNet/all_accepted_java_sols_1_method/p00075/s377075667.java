import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useDelimiter("(\\s|,)+");
		String a;
		while (in.hasNext()) {
			String num = in.next();
			float w = in.nextFloat();
			float h = in.nextFloat();
			if (25 <= w / (h * h)) {
				System.out.println(num);
			}
		}
	}
}