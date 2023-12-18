import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] k = new int[m];
		int[] s = new int[m];
		for (int i = 0; i < m; i++) {
			k[i] = scanner.nextInt();
			for (int j = 0; j < k[i]; j++) {
				s[i]= s[i] | (1<<(scanner.nextInt()-1));
			}
		}
		int[] p = new int[m];
		for (int i = 0; i < m; i++) {
			p[i] = scanner.nextInt();
		}
		
		// ① 全組み合わせをbit表現で展開するループ
		int count = 0;
		for (int i = 0; i < (1<<n); i++) {
			boolean ok = true;
			for (int mi = 0; mi < m; mi++) {
				// ② bitを順番に走査するループ
				
				int ons = s[mi] & i;
				int oncount = 0;
				for (int j = 0; j < n; j++) {
					if ((1 & ons>>j) == 1) {
						oncount++;
					}
				}
				if ((oncount % 2) != p[mi]) {
					ok = false;
					break;
				}
			}
			if (ok) {
				count++;
			}
		}
		System.out.println(count);

	}
}
