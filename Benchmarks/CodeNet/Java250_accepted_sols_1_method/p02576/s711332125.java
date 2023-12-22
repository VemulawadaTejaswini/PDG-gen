import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();

		for (int i = 1; i < n+1; i++) {
			if (i * x >= n) {
				System.out.println(t * i);
				break;
			}
		}

		sc.close();
	}

}