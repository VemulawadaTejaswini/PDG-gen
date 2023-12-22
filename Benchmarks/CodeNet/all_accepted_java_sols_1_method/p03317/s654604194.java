import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		//fill In first line
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);

		//fill in second line
		String[] t = scanner.nextLine().split(" ");
		int[] list = new int[n];

		for(int i = 0; i < n; i++) {

			list[i] = Integer.parseInt(t[i]);

		}

		//easy sort
		int minimum = list[0];
		int times = 0;
		for(int i = 1; i < n; i ++) {
			if(minimum == list[i]) {
				times++;
			}
			if(minimum > list[i]) {
				times = 0;
				minimum = list[i];
			}
		}

		//control
		int ans = 0;
		n -= times;
		while(n > 0) {
			if(n <= k) {
				n -= n;
				ans++;
			}else {
				n -= k - 1;
				ans++;
			}
		}
		System.out.println(ans);

	}

}