import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a[] = { 6000, 4000, 3000, 2000 };

		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int t = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(a[t - 1] * n);
		}
	}
}