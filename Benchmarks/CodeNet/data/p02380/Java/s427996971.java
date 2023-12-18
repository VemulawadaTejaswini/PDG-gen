import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] strs = str.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		int C = Integer.parseInt(strs[2]);

		double S, L, h;
		S = a * b * Math.sin(C) / 2;
		L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C));
		h = b * Math.cos(C);

		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}
