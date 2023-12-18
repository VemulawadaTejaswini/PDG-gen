import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] ans = new int[4];
		while (true) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			int[] a = new int[3];
			Arrays.fill(a, Integer.MAX_VALUE);
			for (int i = 0; i < 3; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp < a[0]) {
					a[2] = a[1]; a[1] = a[0]; a[0] = tmp;
				} else if (tmp < a[1]) {
					a[2] = a[1]; a[1] = tmp;
				} else if (tmp < a[2]) {
					a[2] = tmp;
				}
			}
			int ret = findTriangleType(a);
			if (ret == -1) break;
			ans[0]++;
			ans[ret]++;
		}
		reader.close();
		System.out.print(ans[0]);
		for (int i = 1; i < 4; i++) {
			System.out.print(" " + ans[i]);
		}
		System.out.println();
	}

	private static int findTriangleType(int[] a) {
		int ret = -1;
		int n1,n2,n3;
		n1 = a[0]; n2 = a[1]; n3 = a[2];
		if (n1 + n2 <= n3) {
			ret = -1;
		} else if (n1*n1 + n2*n2 == n3*n3) {
			ret = 1;
		} else if (n1*n1 + n2*n2 > n3*n3) {
			ret = 2;
		} else {
			ret = 3;
		}
		return ret;
	}
}

