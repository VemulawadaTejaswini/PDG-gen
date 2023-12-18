import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

//import org.junit.Test;

public class Main {
//	@Test
//	public void testName() throws Exception {
//		main(null);
//	}

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			new Main().solution(br);
		}
	}

	private void solution(BufferedReader br) throws IOException {
		for (String line = br.readLine(); Objects.nonNull(line); line = br
				.readLine()) {
			String[] strList = line.split(" ", 0);

			int num1 = Integer.parseInt(strList[0]);
			int num2 = Integer.parseInt(strList[1]);
			// String operator = strList[1];

			if (num1 == 0 && num2 == 0) {
				break;
			}

			String ans = calc(num1, num2);
			System.out.println(ans);

		}
	}

	private String calc(int height, int width) {
		String result = "";

		for (int h = 1; h <= height; h++) {
			result += "\r\n";
			for (int w = 1; w <= width; w++) {
				if (h == 1 || h == height) {
					result += "#";
				} else {
					if (w == 1 || w == width) {
						result += "#";
					} else {
						result += ".";
					}
				}
				
			}
			//result += "\r\n";
		}
		return result;

	}
}