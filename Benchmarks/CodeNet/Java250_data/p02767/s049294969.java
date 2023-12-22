import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int l = 100;
		int r = 0;
		int a = Integer.MAX_VALUE;
		String[] tmp = scanner.nextLine().split(" ");
		int[] list = new int[n];


		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(tmp[i]);

			l = Math.min(l,list[i]);
			r = Math.max(r,list[i]);

		}

		int now = 0;

		for(int i = l; i <= r ; i++) {

			now = 0;

			for(int j = 0; j < n; j++) {

				now += (list[j] - i) *  (list[j] - i);

			}

			a = Math.min(a, now);

		}

		System.out.println(a);

	}
}