import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		double inputInt;
		try {
			inputInt = Double.parseDouble(input.readLine());
			System.out.printf("%.6f %.6f",(Math.PI * inputInt * inputInt),(Math.PI  * 2 * inputInt));
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


	}

}

