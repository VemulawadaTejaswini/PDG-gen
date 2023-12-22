import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int ans = 0;
		for (int i = a; i <= b; i++) {
			boolean can = true;
			String x = String.valueOf(i);
			for (int j = 0; j < x.length() / 2; j++) {
				if (x.charAt(j) != x.charAt(x.length() - j - 1)) can = false;
			}
			if (can) ans++;
		}

		System.out.println(ans);


		sc.close();
	}

}
