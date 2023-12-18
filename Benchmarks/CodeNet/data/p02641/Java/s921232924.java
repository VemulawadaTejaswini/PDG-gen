import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int N = scan.nextInt();

		int p[] = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = scan.nextInt();
		}

		int num = X;

		for(int i = 0; i <= 200; i++) {
			if(i % 2 == 1) {
				num -= i;
			}else {
				num += i;
			}

			if(Arrays.asList(p).indexOf(num) == 1) {
				System.out.println(num);
				return;
			}
		}
	}
}