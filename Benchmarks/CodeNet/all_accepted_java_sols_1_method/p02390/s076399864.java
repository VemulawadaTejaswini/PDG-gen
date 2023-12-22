import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt(), m, h;
		s -= (h = (int) (s / 3600)) * 3600;
		s -= (m = (int) (s / 60)) * 60;
		System.out.println(h + ":" + m + ":" + s);
	}
}