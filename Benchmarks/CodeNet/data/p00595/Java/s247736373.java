import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));// ??\????????????????????????
			String line;
			int a = 0, b, temp;
			int x = 0;
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, " ");
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());

				if (a < b) {
					temp = a;
					a = b;
					b = temp;
				}
				while (b != 0) {
					x = a % b;
					a = b;
					b = x;
				}
			}
			System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}