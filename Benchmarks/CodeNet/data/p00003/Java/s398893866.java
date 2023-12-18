import java.io.*;
import java.util.Arrays;

class Main {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		while (str != null) {
			String[] arrays = str.split("\\s", 0);
			Arrays.sort(arrays);
			double[] iArrays = new double[arrays.length];
			for (int i = 0; i < arrays.length; i++) {
				iArrays[i] = Math.pow(Double.valueOf(arrays[i]), 2);
			}
			if ((iArrays[0] + iArrays[1]) == iArrays[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			str = br.readLine();
		}
	}
}