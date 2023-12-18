import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int n = sc.nextInt(),
				s = sc.nextInt();
			int N = (int) Math.pow(10, n);

			int count = 0;
			for (int i = 0 ; i < N ; i++) {
				String K = String.format("%0"+n+"d", i);
				int f = 0;
				for (int j = 0 ; j < n ; j++) {
					f = f | (int) Math.pow(2, (K.charAt(j)-48));
				}
				if (Integer.bitCount(f) < n) continue;

				f = 0;
				for (int j = 0 ; j < n ; j++) {
					f += (j+1) * (int) (K.charAt(j)-48);
				}
				if (f == s) count++;
			}
			System.out.println(""+count);

		}
	}
}