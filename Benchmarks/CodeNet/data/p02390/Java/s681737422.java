import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S / 3600;
		int tmp = S % 3600;
		int m = tmp / 60;
		int s = tmp - m * 60;
		System.out.printf("%d:%d:%d\n", h, m, s);
	}
}

