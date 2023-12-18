import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0) break;
			int w = 2 * n;
			int f[] = new int[w + 1];
			for (int i = 2; i <= w; i++) {
				f[i] = i;
			}
			for (int i = 2; i <= Math.sqrt(w); i++) {
				for(int j = i + i; j <= w; j += i) {
					f[j] = 0;
				}
			}
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (f[i] != 0)
					count++;
			}
			System.out.println(count);
		}
	}
}
