import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double s = 0;
		for(int i = 0;i < N;i++) {
			int a = sc.nextInt();
			s += 1.0/a;
		}

		sc.close();


		System.out.println(1/s);

	}
}
