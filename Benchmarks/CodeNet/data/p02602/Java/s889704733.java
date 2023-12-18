import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		int k        = Integer.parseInt(tmp[1]);
		int mod      = 1000000007;
		String[] tm2 = scanner.nextLine().split(" ");
		long[] list  = new long[n];
		long ksum    = 1;



		for(int i = 0; i < k; i++) {

			 list[i] = Long.parseLong(tm2[i]);
			 ksum   *= list[i];
		}



		for(int i = k; i < n; i++) {

			list[i]  = Long.parseLong(tm2[i]);
		}

		int x = n  - k;
		for(int i = 0; i < x; i++) {

			long now = ksum/list[i] * list[i + k];

			if(now > ksum) {

				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

			ksum = now;
		}
	}
}
