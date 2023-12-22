import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		double sum = 0;

		for (int i = 0; i <= a; i++) {
			if (i % 2 == 1) {
				sum += 1;
			}
		}
		System.out.println(sum / a);
	}
}