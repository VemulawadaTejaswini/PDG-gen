import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int min = n;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int p = sc.nextInt();
			min = Math.min(min, p);
			if (p <= min)
				cnt++;
		}

		System.out.println(cnt);

		sc.close();
	}

}
