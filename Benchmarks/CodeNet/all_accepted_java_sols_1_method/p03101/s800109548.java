import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int white = H * W;
		int black = (H * w) + (W * h);
		black = black - (h*w);
		sc.close();
		System.out.println(white - black);
	}
}