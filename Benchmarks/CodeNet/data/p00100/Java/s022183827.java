import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			int n;
			while (0 != (n = Integer.parseInt(in.readLine()))) {
				int[] num = new int[n];
				long[] tot = new long[n];
				int size = 0;
				for (int i = 0; i < n; i++) {
					int[] cur = new int[3];
					String[] s = in.readLine().split(" ");
					for (int j = 0; j < 3; j++) {
						cur[j] = Integer.parseInt(s[j]);
					}
					int idx;
					for (idx = 0; idx < size && num[idx] != cur[0]; idx++) {}
					num[idx] = cur[0];
					tot[idx] += cur[1] * cur[2];
					if (idx == size) {
						size++;
					}
				}
				boolean flg = true;
				for (int i = 0; i < size; i++) {
					if (tot[i] >= 1000000) {
						flg = false;
						System.out.println(num[i]);
					}
				}
				if (flg) {
					System.out.println("NA");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}