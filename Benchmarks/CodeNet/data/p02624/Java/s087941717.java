import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int yakusuu[] = new int[n];
		long sn = 0;

		for(int i = 1; i < n + 1; i++) {
			for(int j = 1; j < i + 1; j++) {
				if(i % j == 0) {
					yakusuu[i - 1]++;

				}

			}

			sn += i * yakusuu[i - 1];

		}

		System.out.println(sn);



	}
}