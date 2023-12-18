import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = br.readLine().split(" ", 4);
		int x = Integer.parseInt(firstLine[0]);
		int y = Integer.parseInt(firstLine[1]);
		int z = Integer.parseInt(firstLine[2]);
		int k = Integer.parseInt(firstLine[3]);
		long[] xs = new long[x];
		String[] secondLine = br.readLine().split(" ", x);
		for (int i = 0; i < x; i++) {
			xs[i] = Long.parseLong(secondLine[i]);
		}
		
		long[] ys = new long[y];
		String[] thirdLine = br.readLine().split(" ", y);
		for (int i = 0; i < y; i++) {
			ys[i] = Long.parseLong(thirdLine[i]);
		}
		long[] zs = new long[z];
		String[] fourthLine = br.readLine().split(" ", z);
		for (int i = 0; i < z; i++) {
			zs[i] = Long.parseLong(fourthLine[i]);
		}
		long[] xys = new long[x * y];
		int idx = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				xys[idx] = xs[i] + ys[j];
				idx++;
			}
		}
		Arrays.sort(xys);
		long[] xyzs = new long[k * z];
		idx = 0;
		for (int i = Math.max(x * y - k, 0); i < x * y; i++) {
			for (int j = 0; j < z; j++) {
				xyzs[idx] = xys[i] + zs[j];
				idx++;
			}
		}
		Arrays.sort(xyzs);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append(xyzs[xyzs.length - 1 - i]).append("\n");
		}
		System.out.print(sb);
	}
}
