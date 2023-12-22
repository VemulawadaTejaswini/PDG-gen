import java.util.Scanner;

public class Main {
	public static Scanner scanner;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();

		while(x < -100 || 100 < x);
		while(y < -100 || 100 < y);
		while(W < 0 || 100 < W);
		while(H < 0 || 100 < H);
		while(r < 0 || 100 < r);

		if(r <= x && x <= (W-r) && r <= y && y <= (H-r)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}

