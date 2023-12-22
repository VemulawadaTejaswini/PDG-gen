import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int dmx[] = new int[n];
		int dmy[] = new int[m];
		for (int i = 0; i < n; i++) {
			dmx[i] = sc.nextInt();
		}
		for (int i = 0; i < m; i++) {
			dmy[i] = sc.nextInt();
		}
		Arrays.sort(dmx);
		Arrays.sort(dmy);
		boolean b = false;
		for (int i = x + 1; i <= y; i++) {
			if (dmx[n - 1] < i && dmy[0] >= i) {
				b = true;
			}
		}
		if (b) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}
