import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int A = Integer.parseInt(Ws[0]);
		int B = Integer.parseInt(Ws[1]);
		int C = Integer.parseInt(Ws[2]);

		System.out.println(Math.max(C-(A-B),0));

	}

}
