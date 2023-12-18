
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x1 = scn.nextInt();
		int y1 = scn.nextInt();
		int x2 = scn.nextInt();
		int y2 = scn.nextInt();
		int a = (x2 - x1) * (x2 - x1);
		int b = (y2 - y1) * (y2 - y1);
		System.out.println(Math.sqrt(a + b));
	}
}
