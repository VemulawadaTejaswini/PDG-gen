import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		int N = Integer.parseInt(Ws[0]);
		int K = Integer.parseInt(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");

		long[] H = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			H[i] = Long.parseLong(Ws[i]);
		}

		Arrays.sort(H);
		long sum=0;
		for(int i=N-1-K;i>=0;i--){
			sum+=H[i];
		}

		System.out.println(sum);
	}
}
