import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int top1 = 0,top2 = 0,top3 = 0,hill;

		for (int i = 1;i <= 10;i++) {
			if ((hill = scanner.nextInt()) > top1) {
				top3 = top2;
				top2 = top1;
				top1 = hill;
			}
		}

		System.out.println(top1);
		System.out.println(top2);
		System.out.println(top3);
	}
}