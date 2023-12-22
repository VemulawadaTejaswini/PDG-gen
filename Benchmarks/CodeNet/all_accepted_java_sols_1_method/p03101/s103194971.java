import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int tate = 0;
		int yoko = 0;
		int tyohuku = 0;

		tate = h * W;
		yoko = w * H;
		tyohuku = h * w;

		System.out.println(H * W - (tate + yoko - tyohuku));
	}
}
