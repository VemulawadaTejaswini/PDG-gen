import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int result = 0;

			for (int i = a; i <= b; i++) {
				if (c%i == 0) result++;
			}

			System.out.println(result);
		}
	}
}
