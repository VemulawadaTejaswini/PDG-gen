import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		if (x < -100 || y > 100 || W <= 0 || r > 100) {
			System.out.println("値は−100≤x,y≤100,0<W,H,r≤100で入力してください");
		} else if ((x - r) >= 0 && (W - x) >= r && (y - r) >= 0 && (H - y) >= r) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}

