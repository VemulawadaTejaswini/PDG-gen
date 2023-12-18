import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = 0;i < 10000;i++) {
			double xa = (double)i * 0.08;
			double xb = (double)i * 0.1;
			if(a == (int)xa && b == (int)xb) {
				System.out.println(i);
				return;
			}
		}

		System.out.println(-1);
	}
}
