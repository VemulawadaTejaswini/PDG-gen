import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int x = Integer.parseInt(tmp[0]);
		int n = Integer.parseInt(tmp[1]);

		String[] tmp1 = scanner.nextLine().split(" ");
		int[] list = new int[102];
		int a = 0;
		list[0] = 0;
 		for(int i = 0; i < n; i++) {

			a = Integer.parseInt(tmp1[i]);

			list[a]++;

		}

		int ans = 101;
		int count = 101;
		for(int i = 101; i >= 0; i --) {


			if(list[i] != 1) {

				ans = Math.min(ans, Math.abs(x - i));

				if(ans == Math.abs(x - i)) {

					count = Math.min(count, i);

				}
			}

		}

		System.out.println(count);


	}

}
