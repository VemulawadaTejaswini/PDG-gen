import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt() * 2;
		int x = sc.nextInt();
		int y = sc.nextInt();

		int max = x > y ? x : y;

		int min = Integer.MAX_VALUE;
		for(int i = 0; i <= max; i++) {
			// cの分
			int sum = i * c;

			// aの分を足りない分を買い足す
			if(x > i)
				sum += (x - i) * a;

			// bの分を足りない分を買い足す
			if(y > i)
				sum += (y - i) * b;

			min = min < sum ? min : sum;
		}
		System.out.print(min);
	}
}
