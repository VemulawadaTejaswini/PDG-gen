import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		ArrayList<Long> list = new ArrayList<Long>(n);
		long ans = 1;

		for(int i = 0;i < n;i++) {
			list.add(scan.nextLong());
		}

		for(int i = 0;i < n;i++) {
			ans *= list.get(i);
		}

		if(ans > (long)Math.pow(10, 18)) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}
	}
}
