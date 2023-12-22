import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		sc.close();

		int Hh = 0;
		Hh = H - h;
		int Ww = 0;
		Ww = W - w;
		int ans = 0;
		ans = Hh * Ww;
		System.out.println(ans);


	}
}
