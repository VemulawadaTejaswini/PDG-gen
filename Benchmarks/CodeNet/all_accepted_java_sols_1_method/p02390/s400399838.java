import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int h, m, s;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		h = a / 3600;
		m = (a - (h * 3600)) / 60;
		s = a - ((h * 3600) + (m * 60));
		System.out.println(h + ":" + m + ":" + s);
	}
}