import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		float x1, y1, x2, y2;
		x1 = y1 = x2 = y2 = 0;
		try {
			x1 = stdin.nextFloat();
			y1 = stdin.nextFloat();
			x2 = stdin.nextFloat();
			y2 = stdin.nextFloat();
		} catch (Exception e) {
			e.printStackTrace();
		}
		stdin.close();
		System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
	}
}