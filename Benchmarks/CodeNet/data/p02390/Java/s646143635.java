import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int S = new Scanner(System.in).nextInt();
		if(S < 0 || S > 86400) {
			throw new IllegalArgumentException("引数が誤っている。");
		}
		int h = S / 3600;
		int m = (S - (h * 3600)) / 60;
		int s = (S- (h * 3600) - (m * 60));
		System.out.println(h + ":" + m + ":"+ s);
	}
}
