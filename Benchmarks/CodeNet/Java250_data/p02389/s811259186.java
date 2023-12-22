import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		String[] strs = str.split(" ");
		//aを入力する
		int a = Integer.parseInt(strs[0]);
		//bを入力する
		int b = Integer.parseInt(strs[1]);
		//面積を計算する
		int s = area(a, b);
		//周の長さを計算する
		int l = circumference(a, b);
		//面積と周の長さを出力する
		System.out.println(s + " " + l);	
	}
	/**
	 * 面積を計算する
	 * @param a
	 * @param b
	 * @return 長方形の面積
	 */
	public static int area(int a, int b) {
		return a * b;
	}

	/**
	 * 周の長さを計算する
	 * @param a
	 * @param b
	 * @return 長方形の周の長さ
	 */
	public static int circumference(int a, int b) {
		return (a*2)+(b*2);
	}
}