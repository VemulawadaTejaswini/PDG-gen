import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		long K = scn.nextLong();
		long[] X = new long[N];
		for(int i = 0;i < N;i++) {
			X[i] = scn.nextLong();
		}

		for(int i = 0;i < N;i++) {
			for(int j = i+1;j < N;j++) {
				if(X[i] > X[j]) {
					long buf = X[i];
					X[i] = X[j];
					X[j] = buf;
				}
			}
		}
		int ans = 0;
		for(int i = 0;i < N;i++) {
			if(K - X[i] < 0) {
				K -= X[i];
				break;
			}
			ans++;
			K -= X[i];
		}
		if(K>0)ans--;

		System.out.println(ans);
		scn.close();
	}
}
