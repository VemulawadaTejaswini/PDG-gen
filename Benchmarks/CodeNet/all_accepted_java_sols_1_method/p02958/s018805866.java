
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int p[] = new int[N];
		int psort[] = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			psort[i] = p[i];
		}

		Arrays.sort(psort);

		for (int i = 0; i < N; i++) {
			if (!(p[i] == psort[i])) {
				count++;
			}
		}

		if (count ==2 || count == 0) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}

	}
}