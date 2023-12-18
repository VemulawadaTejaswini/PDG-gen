import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String line = br.readLine();
		String[] str = line.split(" ");
		int[] a = new int[n];
		int max = 0;
		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(str[i]);
			max = Math.max(max,a[i]);
		}

		int ans = a[0];
		for (int i=1; i<n; i++) {
			int gcd = gcd(ans,a[i]);
			ans = ans*a[i]/gcd;
		}

		System.out.println(ans);

		br.close();
	}

	static int gcd(int x,int y) {
		if (y == 0)
			return x;
		else
			return gcd(y,x%y);
	}
}