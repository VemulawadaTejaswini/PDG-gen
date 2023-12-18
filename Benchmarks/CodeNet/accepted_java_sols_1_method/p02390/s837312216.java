import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int h, m, s;
		h = i / 60 / 60;
		m = (i - (h * 60 * 60)) / 60;
		s = (i - (h * 60 * 60) - (m * 60));
		System.out.println(h + ":" + m + ":" + s);
	}
}