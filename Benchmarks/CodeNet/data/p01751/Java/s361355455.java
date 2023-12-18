import java.util.Scanner;

class Problem2639 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = 0;

		if (a + b == 60) {
			System.out.println(-1);
			return;
		}
		
		for (;;) {
			int w1 = t;
			int w2 = t + a;
			int r = t / 60;
			int arrive = 60 * r + c;
			
			if (w1 <= arrive && arrive <= w2) {
				System.out.println(arrive);
				break;
			}

			t += a + b;
		}
	}
}