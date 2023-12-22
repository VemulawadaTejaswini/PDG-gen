import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int H = Integer.parseInt(Ws[0]);
		int A = Integer.parseInt(Ws[1]);
		System.out.println((H+A-1)/A);
	}
}
