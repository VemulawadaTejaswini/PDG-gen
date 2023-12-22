import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int top1 = 0,top2 = 0,top3 = 0;

		for (int i = 1;i <= 10;i++) {
			int hill = scanner.nextInt();

			if (hill >= top1) {
				top3 = top2;
				top2 = top1;
				top1 = hill;
			} else if (hill >= top2) {
				top3 = top2;
				top2 = hill;
			} else if (hill >= top3) {
				top3 = hill;
			}
		}

		System.out.println(top1);
		System.out.println(top2);
		System.out.println(top3);
	}
}