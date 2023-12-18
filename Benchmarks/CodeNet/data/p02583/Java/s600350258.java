import java.util.Scanner;
public class Main {
	public static int[] L;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		L = new int[N];
		for (int n = 0;n < N ;n++ ) {
			L[n] = Integer.parseInt(scan.next());
		}
		scan.close();
		System.out.println(MakingTriangle(N));
	}

	public static long MakingTriangle(int N) {
		long ans = 0;
		if (N < 3) return ans;
		for (int i = 0;i < N - 2 ;i++ ) {
			for (int j = i + 1;j < N - 1 ;j++ ) {
				for (int k = j + 1;k < N ;k++ ) {
					if ((L[i] == L[j]) || (L[j] == L[k]) || (L[k] == L[i])) continue;
					if ((L[i] + L[j] <= L[k]) || (L[j] + L[k] <= L[i]) || (L[k] + L[i] <= L[j])) continue;
					ans++;
				}
			}
		}
		return ans;
	}
}
