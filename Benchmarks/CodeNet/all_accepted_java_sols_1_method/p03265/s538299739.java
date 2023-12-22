import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int x3 = x2-(y2-y1);
		int y3 = y2+(x2-x1);
		int x4 = x1-(y2-y1);
		int y4 = y1+(x2-x1);

		System.out.println(x3+" "+y3+" "+x4+" "+y4);
	}
}
