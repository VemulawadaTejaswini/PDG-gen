import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w;
		int money;
		
		while (true) {
			w = sc.nextInt();
			if (w == -1) {
				break;
			}
			
			money = 0;
			if (30 < w) {
				money += (w - 30) * 160;
				w = 30;
			}
			if (20 < w) {
				money += (w - 20) * 140;
				w = 20;
			}
			if (10 < w) {
				money += (w - 10) * 125;
				w = 10;
			}
			if (0 <= w && w <= 10) {
				money += 1150;
			}
			System.out.println(4280 - money);
		}
	}
}