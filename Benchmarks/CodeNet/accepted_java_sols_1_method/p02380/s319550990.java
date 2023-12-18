import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] strArr = br.readLine().split("\\s");
			int a = Integer.parseInt(strArr[0]); // 底辺
			int b = Integer.parseInt(strArr[1]); // 斜辺
			int C = Integer.parseInt(strArr[2]); // 斜辺と底辺に挟まれた角度
			
			double h = b * Math.sin(Math.toRadians(C)); // 高さ
			double S = a * h / 2; // 三角形の面積
			// 三角形の周の長さ
			double L = a + b + Math.sqrt(a * a + b * b -2 * a * b * Math.cos(Math.toRadians(C)));
			
			System.out.println(S);
			System.out.println(L);
			System.out.println(h);
			
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} 
	}

}

