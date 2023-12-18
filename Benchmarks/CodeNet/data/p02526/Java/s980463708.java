import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		byte[] u = new byte[10000001];
		for (int i = 0; i < n; i++) {
			u[sc.nextInt()]++;
		}

		int count = 0;
		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			count += u[sc.nextInt()];
		}

		System.out.println(count);

		sc.close();
	}
}