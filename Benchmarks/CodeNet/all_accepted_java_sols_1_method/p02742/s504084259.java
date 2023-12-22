import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] xy = null;
		xy = br.readLine().split(" ");
		long hNum = Long.parseLong(xy[0]);
		long wNum = Long.parseLong(xy[1]);

		if (hNum == 1 || wNum == 1) {
			System.out.println(1);
		} else if ((hNum * wNum) % 2 == 0) {//偶数なら
			System.out.println(hNum * wNum / 2);
		} else {
			System.out.println(hNum * wNum / 2 + 1);
		}

	}
}
