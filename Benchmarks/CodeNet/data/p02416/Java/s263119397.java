import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		//while (true) {
		int sum = 0;//初期化
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {//
			sum = 0;
			String sr = br.readLine();//文字列入力
			if (sr.equals("0")) {
				break;
			}
			for (int i = 0; i < sr.length(); ++i) {//桁数分の繰り返し
				char ch = sr.charAt(i);//桁ごとに数字を抜き出し

				sum += Character.getNumericValue(ch);//抜き出した数字を順番に加算

			}
			System.out.println(sum);
		}

	}

}

