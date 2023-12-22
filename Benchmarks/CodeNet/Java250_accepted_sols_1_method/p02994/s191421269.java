import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		sc.close();
		// N個のリンゴ全てを材料としてできるアップルパイの「味」
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += L + i - 1;
		}
		// System.out.println("sum = " + sum);
		// N - 1個のリンゴを材料としてできるアップルパイの「味」との差
		int min = Integer.MAX_VALUE;
		int r = sum;
		for(int i = 1; i <= N; i++) {
			int apple =  L + i - 1;
			int abs = Math.abs(apple);
			// System.out.println("apple = " + apple + " : " +  (sum - apple));
			if(abs < min) {
				min = abs;
				r = sum - apple;
			}
		}
		// System.out.println("min = " + min);
		System.out.println(r);
	}
}
