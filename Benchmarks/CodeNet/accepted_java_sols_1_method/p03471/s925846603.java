import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int Y = scan.nextInt();

		int output1000 = 0;
		int output5000 = 0;
		int output10000 = 0;

		findRoop: for (int sen = 0; sen <= N; sen++) {
			for (int gosen = 0; gosen <= N - sen; gosen++) {
				if (1000*sen + 5000*gosen + 10000*(N-sen-gosen) == Y) {
					output1000 = sen;
					output5000 = gosen;
					output10000 = N - sen - gosen;
					break findRoop;
				}
			}
		}

		if (output1000 == 0 && output5000 == 0 && output10000 == 0) {
			System.out.print(-1 + " " + -1 + " " + -1);
		} else {
			System.out.print(output10000 + " " + output5000 + " " + output1000);
		}
	}

}