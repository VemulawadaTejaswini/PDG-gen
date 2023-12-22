import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Y = sc.nextInt();
		int yen10000 = -1;
		int yen5000 = -1;
		int yen1000 = -1;

		for(int x = 0; x <= N; x++) {
			for(int y = 0; y <= N; y++) {
				int z = N - x - y;
				if (z >= 0) {
					int total = 10000*x + 5000*y + 1000*z;
					if(total == Y) {
						yen10000 = x;
						yen5000 = y;
						yen1000 = z;
					}
				}

			}
		}

		System.out.print(yen10000 + " ");
		System.out.print(yen5000 + " ");
		System.out.print(yen1000);
	}
}
