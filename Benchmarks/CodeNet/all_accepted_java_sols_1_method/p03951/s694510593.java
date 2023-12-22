import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int ans = N*2;

		if (s.equals(t)) {
			System.out.println(N);
			System.exit(0);
		}

		for (int i = 0; i < N; i++) {
			String sSub = s.substring(N-1-i, N);
			String tSub = t.substring(0, i+1);
			if (sSub.equals(tSub)){
				ans = (N-(i+1))*2 + i+1;
			}
		}

		System.out.println(ans);

		sc.close();
	}
}