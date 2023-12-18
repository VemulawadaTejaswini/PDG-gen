import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int N = scn.nextInt();
			long[] a = new long[N];

			for(int i = 0; i < N; i++) {
				a[i] = scn.nextLong();
				if(a[i] == 0) {
					System.out.println(0);
					System.exit(0);
				}
			}

			long max = (long) Math.pow(10, 18);
			max++;

			long tmp = a[0];
			for(int i = 1; i < N; i++){
				if(tmp * a[i] / max >= 1 || tmp * a[i] < tmp) {
					System.out.println(-1);
					System.exit(0);
				}
				tmp *= a[i];
			}
			System.out.println(tmp);
		}
	}
}