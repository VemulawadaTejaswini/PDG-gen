import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 整数の個数
		int minNum = Integer.parseInt(br.readLine()); // 最小値
		int maxNum = -1000000000; // 差額の最大値
		for (int i = 1; i < n; i++) {
			int r = Integer.parseInt(br.readLine());
			maxNum = Math.max(maxNum, r - minNum);
			minNum = Math.min(minNum, r);
		}
		System.out.println(maxNum);

	}

}
