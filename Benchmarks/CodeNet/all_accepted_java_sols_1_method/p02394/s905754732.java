import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		int x = in.nextInt();
		int y = in.nextInt();
		int r = in.nextInt();
		String result = "Yes";
		
		if ((x < 0) || (y < 0)) {
			result = "No";
		} else if ((w < (x + r)) || (h < (y + r))) {
			result = "No";
		}

		System.out.println(result);
	}
}