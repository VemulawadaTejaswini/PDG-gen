import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int dept = 100000; // 10万円の借金

		for (int i = 0; i < n; i++) {
			dept *= 1.05; // 5%の利子

			// 1000未満を切り上げ
			if (dept % 1000 != 0) {
				dept = (dept / 1000) + 1;
				dept *= 1000;
			}

		}

		System.out.println(dept);
	}

}