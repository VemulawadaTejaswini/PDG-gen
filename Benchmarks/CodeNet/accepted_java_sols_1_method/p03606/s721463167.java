import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int[] l =  new int[N];
		int[] r = new int[N];
		for (int i = 0; i < N; i++) {
			l[i] = scanner.nextInt();
			r[i] = scanner.nextInt();
		}

		/*
		for (int i : l) {
			System.out.println("l：" + i);
		}
		for (int i : r) {
			System.out.println("r：" + i);
		}
		*/

		int count = 0;
		for (int i = 0; i < N; i++) {
			count += r[i] - l[i] + 1;
		}
		System.out.println(count);

	}

}