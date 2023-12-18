import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			while (true) {
				int a = sc.nextInt();
				int b = sc.nextInt();

				if ((a == 0) && (b == 0)) break;

				System.out.println(Math.min(a, b) + " " + Math.max(a, b));
			}
		}
	}
}
