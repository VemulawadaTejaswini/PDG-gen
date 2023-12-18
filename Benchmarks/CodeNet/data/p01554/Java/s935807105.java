import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N, M, flag;
		int con = 0;

		String[] U = new String[256];
		String[] T = new String[256];

		N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			U[i] = scan.next();
		}

		M = scan.nextInt();
		for (int i = 0; i < M; i++) {
			T[i] = scan.next();
		}

		for (int i = 0; i < M; i++) {
			flag = 0;
			for (int j = 0; j < N; j++) {
				if (U[j].equals(T[i])) {
					con++;
					if ((con % 2) == 1)
						System.out.println("Opened by " + T[i]);
					if ((con % 2) == 0)
						System.out.println("Closed by " + T[i]);
					flag = 1;
				}
			}
			if (flag == 0)
				System.out.println("Unknown " + T[i]);
		}

	}
}