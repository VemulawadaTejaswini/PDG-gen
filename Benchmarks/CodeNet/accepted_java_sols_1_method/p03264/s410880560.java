import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int count = 0;

		for (int i=1; i<=k; i++) {
			boolean odd = false;
			if (i%2 == 1) {
				odd = true;
			}
			for (int j=i; j<=k; j++) {
				if ((j%2 == 1) != odd) {
					count++;
				}
			}
		}

		System.out.println(count);

		sc.close();
	}

}