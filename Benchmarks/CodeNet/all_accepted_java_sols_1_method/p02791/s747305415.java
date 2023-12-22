import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con =0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int item = sc.nextInt();
			if (min > item) {
				min = item;
			}
			if (min >= item) {
				con++;
			}
		}

		System.out.println(con);

	}
}