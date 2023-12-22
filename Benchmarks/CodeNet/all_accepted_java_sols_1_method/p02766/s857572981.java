import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int K = Integer.parseInt(Ws[1]);

		int ans =1;
		while(N>=Math.pow(K, ans)){
			ans++;
		}
		System.out.println(ans);

	}

}
