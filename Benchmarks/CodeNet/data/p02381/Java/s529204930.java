import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		try {
			while ((n = Integer.parseInt(br.readLine())) != 0) {
				String[] input = br.readLine().split("\\s+");
				// 平均を取得
				double ava = Arrays.stream(input).mapToDouble(Double::parseDouble).sum() / n;
				// スクエアの平均値を取得
				double square = Arrays.stream(input).mapToDouble(Double::parseDouble).map(i -> (i - ava) * (i - ava))
						.sum() / n;
				// 回答
				System.out.println(Math.sqrt(square));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
