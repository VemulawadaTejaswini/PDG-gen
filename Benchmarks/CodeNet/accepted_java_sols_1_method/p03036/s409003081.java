import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int d = sc.nextInt();
		int x2000 = sc.nextInt();
		int xi = x2000;

		for (int i = 1; i <= 10; i++) {
			xi = r * xi - d;
			System.out.println(xi);
		}

		sc.close();
	}

}
