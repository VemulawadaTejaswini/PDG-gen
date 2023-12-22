import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] tmp = sc.nextLine().split(" ");
		long[] list = new long[n];
		long ans   = 0;


		list[0] = Long.parseLong(tmp[0]);
		for(int i = 1; i < n; i++) {

			list[i] = Long.parseLong(tmp[i]);

			if(list[i - 1] > list[i]) {

				ans += list[i - 1] - list[i];
				list[i] = list[i - 1];

			}
		}

		System.out.println(ans);
	}

}
