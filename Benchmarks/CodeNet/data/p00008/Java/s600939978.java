import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int num,count;
		while (null != (str = in.readLine())) {
			count = 0;
			num = Integer.parseInt(str);
			for (int i = 0; i <= 9; i++) {
				for (int j = 0; j <= 9; j++) {
					for (int k = 0; k <= 9; k++) {
						for (int l = 0; l <= 9; l++)
							count += (i + j + k + l == num) ? 1 : 0;
					}
				}
			}
			System.out.println(count);
		}
	}
}