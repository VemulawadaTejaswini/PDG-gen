import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
			int W = src.nextInt();
			int H = src.nextInt();
			int x = src.nextInt();
			int y = src.nextInt();
			int r = src.nextInt();

			if(((r <= x) && (x <= W-r)) && ((r <= y) && (y <= H-r))) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
	}
}

