import java.io.*;
import java.util.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		String[] Ws = W.split(" ");
		long N = Long.parseLong(Ws[0]);
		long K = Long.parseLong(Ws[1]);

		W = in.readLine();
		Ws = W.split(" ");
		long[] l = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			l[i] = Long.parseLong(Ws[i]);
		}
		Arrays.sort(l);

		long ans = 0;
		for(int i=0;i<K;i++){
			ans+=l[(int)N-1-i];
		}
		System.out.println(ans);
	}
}
