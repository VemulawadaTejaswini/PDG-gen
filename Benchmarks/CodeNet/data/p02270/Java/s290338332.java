import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] sp1 = (in.readLine()).split(" ");

		// Scanner sc = new Scanner(System.in);
		// String line1 = sc.nextLine();
		// String[] sp1 = line1.split(" ");

		int n = Integer.parseInt(sp1[0]);
		int k = Integer.parseInt(sp1[1]);

		int P = 0;
		int sum = 0;

		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = Integer.parseInt(in.readLine());
			sum += w[i];
			P = Math.max(P, w[i]);
		}

		P = Math.max(P, sum / n);

		int kCount = 0;
		int nCount = 0;

		while (true) {
			nCount = 0;
			kCount = 0;
			while (nCount < n && kCount < k) {
				int weight = 0;
				while (nCount < n && weight + w[nCount] <= P) {
					weight += w[nCount];
					nCount++;
				}
				kCount++;
			}

			if (nCount == n) {
				System.out.println(P);
				break;
			}
			P++;
		}

	}

}