import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();

		int h = S / 3600;
		S = S - 3600 * h;
		int m = S / 60;
		S = S - 60 * m;
		int s = S;

		String a = h + ":" + m + ":" + s;
		System.out.println(a);
	}
}