import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			double S = Double.parseDouble(str);
			S /= 3600;
			int h = (int)Math.floor(S);
			int m = (int)Math.floor((S - h) * 60);
			int s = (int) Math.round((((S - h) * 60) - m) * 60);
			String w = String.valueOf(h) + ":" + String.valueOf(m) + ":" + String.valueOf(s);
			System.out.println(w);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}