import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] H = new int[N];
		for(int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		for(int i = 0; i < N; i++) {
			boolean ok = true;
			for(int j = 0; j < i; ++j) {
				if(H[i] < H[j]) {
					ok = false;
					break;
				}
			}
			if(ok) ans++;
		}
		System.out.println(ans);
	}
}