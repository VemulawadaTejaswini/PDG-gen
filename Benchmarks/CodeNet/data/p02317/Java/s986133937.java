import java.util.*;
import java.io.*;

class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int[] dp = new int[n];
		dp[0] = a[0];
		int length = 1;

		for (int i=1; i<n; i++) {
			if (dp[length-1] < a[i]) {
				dp[length++] = a[i];
			}else {
				int index = Arrays.binarySearch(dp,0,length,a[i]);
				if (index < 0)
					index = ~index;
				dp[index] = a[i];
			}
		}

		System.out.println(length);

		br.close();
	}
}