import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String Nb1 = scan.next();
		int N = Integer.valueOf(Nb1);
		int[] nb = new int[N];

		for (int i = 0; i < N; i++) {
			String Nb = scan.next();
			nb[i] = Integer.valueOf(Nb);
		}
		int a;
		int b;
		int count = 0;
		int renzoku = 0;
		for (int i = 0; i < N - 1; i++) {
			a = nb[i];
			b = nb[i + 1];
			if (renzoku == 2) {
				renzoku = 0;
			}
			if (renzoku == 1) {
				renzoku = 2;
			}
			if (a == b && renzoku == 0) {
				count++;
				renzoku++;
			}

		}

		System.out.println(count);

	}
}