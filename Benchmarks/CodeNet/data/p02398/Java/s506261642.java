import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int ary[] = new int[3];

		Scanner sc = new Scanner(System.in);
		ary[0] = sc.nextInt();
		ary[1] = sc.nextInt();
		ary[2] = sc.nextInt();
		
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] < 1 || ary[i] > 10000 || ary[0] > ary[1]) {
				System.err.println("Err!");
				return;
			}
		}
		
		int count = 0; // 約数の個数
		for (int i = ary[0]; i <= ary[1]; i++) {
			if (ary[2] % i == 0) {
				count++;
			}
		}
		System.out.println(count);

	}
}
