import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		long d = Long.parseLong(scan.next());
		int count = 0;

		long[] x = new long[n];
		long[] y = new long[n];

		for(int i=0;i<n;i++) {
			x[i] = Long.parseLong(scan.next());
			y[i] = Long.parseLong(scan.next());
			if((x[i] * x[i]) + (y[i] * y[i]) <= (d * d)) {
				count++;
			}
		}

		//プログラムはここに記入

		System.out.println(count);

		scan.close();
	}
}
