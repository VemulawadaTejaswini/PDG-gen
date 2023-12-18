import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static BufferedReader br = null;

	public static void main(String[] args) {

		br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			try {
				String line = null;
				String[] lines = null;

				line = br.readLine();
				lines = line.split(" ");
				int N = Integer.parseInt(lines[0]);
				int K = Integer.parseInt(lines[1]);

				if (N == 0 && K == 0) {
					return;
				}

				line = br.readLine();
				lines = line.split(" ");
				int[] bloodAmt = new int[K];
				for (int i = 0; i < K; i ++) {
					bloodAmt[i] = Integer.parseInt(lines[i]);
				}

				for (int i = 0; i < N; i ++) {
					line = br.readLine();
					lines = line.split(" ");
					for (int j = 0; j < K; j ++) {
						bloodAmt[j] -= Integer.parseInt(lines[j]);
					}
				}

				for (int i = 0; i < K; i ++) {
					if (bloodAmt[i] < 0) {
						System.out.println("No");
						break;
					}
					if (i == K-1) {
						System.out.println("Yes");
					}
				}

			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}