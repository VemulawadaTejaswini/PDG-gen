import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		int st = x - k + 1;
		int ed = x + k - 1;
		for (int i = st; i <= ed; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		sc.close();
	}

}
