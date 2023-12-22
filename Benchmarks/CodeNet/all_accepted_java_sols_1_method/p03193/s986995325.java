import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();

		int count = 0;

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(h <= a && w <= b) {
				count++;
			}
		}

		System.out.println(count);

		sc.close();
	}

}
