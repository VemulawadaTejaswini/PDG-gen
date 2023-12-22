import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] arg) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int DATE_QUANTITY = Integer.parseInt(br.readLine());
		for (int i = 0; i < DATE_QUANTITY; i++) {
			String[] splitedLine = br.readLine().split(" ");
			int[] val = new int[3];
			for (int j = 0; j < 3; j++) {
				int tmp = Integer.parseInt(splitedLine[j]);
				val[j] = (int) Math.pow(tmp, 2);
			}
			Arrays.sort(val);
			if ((val[0] + val[1]) == val[2]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}