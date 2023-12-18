import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = (S / 60)/60;
		int m = S /60 - h * 60;
		int s = S - h * 60 * 60 - m *60;

		System.out.println(h + ":" + m + ":" + s);
		sc.close();
	}
}