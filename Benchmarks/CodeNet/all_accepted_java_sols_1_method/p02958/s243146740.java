import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int[] s = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = sc.nextInt();
			s[i] = p[i];
		}
		sc.close();
		Arrays.sort(s);
		// System.out.println(Arrays.toString(p));
		// System.out.println(Arrays.toString(s));
		int r = 0;
		for(int i = 0; i < N; i++) {
			if(p[i] != s[i]) r++;
		}
		// System.out.println(r);
		System.out.println(r == 0 || r == 2 ? "YES" : "NO");
	}
}
