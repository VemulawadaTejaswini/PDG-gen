import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			str = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] input = str.split(" ");
		Integer ballCnt = Integer.parseInt(input[0]);
		Integer colorCnt = Integer.parseInt(input[1]);

		if (1 > ballCnt || 1000 < ballCnt) {
			System.out.println("input N error");
		}
		if (2 > colorCnt || 1000 < colorCnt) {
			System.out.println("input K error");
		}

		int result = 0;
		for (int i = 0; i < ballCnt; i++) {
			if (i == 0) {
				result = colorCnt;
			} else {
				result *= (colorCnt - 1);
			}
		}

		System.out.println(result);

	}
}
