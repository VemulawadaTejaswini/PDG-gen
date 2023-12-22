import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int h = t / 3600;
		int m = (t - h * 3600) / 60;
		int s = t - h * 3600 - m * 60;
		System.out.printf("%d:%d:%d\n", h, m, s);
	}

}
