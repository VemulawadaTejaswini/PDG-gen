import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();
		int a = H * W;
		int b = h * W;
		int c = w * H;
		int d = h * w;
		System.out.println(a - b - c + d);
	}

}
