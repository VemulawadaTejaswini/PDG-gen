import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int delicious = 0;
		boolean poison = false;

		for(int i = 0; c > 0; i++) {

			// 2連続毒
			if(poison) {
				c--;
				break;
			}

			// Cを食べる
			c--;
			delicious++;

			poison = true;

			// 解毒
			if(b > 0) {
				b--;
				delicious++;
				poison = false;
			} else if(a > 0) {
				a--;
				poison = false;
			}
		}

		delicious += b;
		System.out.println(delicious);
	}
}
