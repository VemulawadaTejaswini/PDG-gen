import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// Listに標準入力の値を取得
		ArrayDeque<String> inputs = new ArrayDeque<>();
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			while (br.ready()) {
				String[] lineArray = br.readLine().split(" ");
				Arrays.<String> stream(lineArray).forEach(s -> inputs.add(s.trim()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 入力取得
		int a_vit = Integer.parseInt(inputs.pop());
		int a_atk = Integer.parseInt(inputs.pop());
		int b_vit = Integer.parseInt(inputs.pop());
		int b_atk = Integer.parseInt(inputs.pop());

		while (true) {
			b_vit -= a_atk;
			if (b_vit <= 0) {
				System.out.println("Yes");
				break;
			}
			a_vit -= b_atk;
			if (a_vit <= 0) {
				System.out.println("No");
				break;
			}
		}
	}
}
