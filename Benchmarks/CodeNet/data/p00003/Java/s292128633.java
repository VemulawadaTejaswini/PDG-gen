import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double a = Math.pow(sc.nextInt(), 2);
			double b = Math.pow(sc.nextInt(), 2);
			double c = Math.pow(sc.nextInt(), 2);
			if (a + b == c || b + c == a || a + c == b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}