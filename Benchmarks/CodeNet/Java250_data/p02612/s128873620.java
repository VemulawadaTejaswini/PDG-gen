import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		int price;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			price =Integer.parseInt(reader.readLine());
			System.out.println((10000 - price) % 1000);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
