import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		Long k 	     = Long.parseLong(tmp[0]);
		int  n 	     = Integer.parseInt(tmp[1]);

		String[] tp  = scanner.nextLine().split(" ");
		long[] list  = new long[n];
		for(int i = 0; i < n; i++) list[i] = Long.parseLong(tp[i]);

		long ans = 0;

		for(int j = 0; j < n; j++) {

			if(j != n - 1) ans = Math.max(ans, list[j + 1] - list[j]);
			else ans = Math.max(ans, Math.abs(list[0] +  (k- list[j])));


		}

		System.out.println(k - ans);



	}
}