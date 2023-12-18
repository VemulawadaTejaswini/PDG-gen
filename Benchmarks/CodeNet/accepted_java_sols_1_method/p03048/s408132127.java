import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R = scn.nextInt();
		int G = scn.nextInt();
		int B = scn.nextInt();
		int N = scn.nextInt();
		int ans = 0;
		for (int i = 0; i <= N / R; i++) {
			for (int j = 0; j <= (N - R * i) / G; j++) {
				if ((N - R * i - G * j) % B == 0)
					ans++;
			}
		}
		System.out.println(ans);
	}

}
