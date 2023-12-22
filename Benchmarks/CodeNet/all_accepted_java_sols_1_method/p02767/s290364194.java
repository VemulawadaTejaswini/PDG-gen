import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] X = new int[n];
		int sum = Integer.MAX_VALUE;

		for(int i=0;i<n;i++) {

			X[i] = scan.nextInt();
		}

			for(int j=1;j<=100;j++) {

				int hp = 0;
				for(int i:X) {
				hp += (i-j)*(i-j);
			}
				sum = Math.min(hp,sum);
			}

		System.out.println(sum);

		scan.close();

	}

}
