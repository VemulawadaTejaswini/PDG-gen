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
			long chk = (long) Math.pow(10, 12);

			long tmp = a[0];
			for(int i = 1; i < N; i++){
				if(tmp > chk && a[i] > chk) {
					System.out.println(-1);
					System.exit(0);
				}
				tmp *= a[i];
				if(tmp / max < 1) {
					System.out.println(-1);
					System.exit(0);
				}
			}
			if(tmp > max) {
			} else {
				System.out.println(tmp);
			}
		}
	}
}