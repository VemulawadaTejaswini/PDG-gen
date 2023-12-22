import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		int N = Integer.parseInt(W);
		W = in.readLine();
		String[] Ws = W.split(" ");

		long[] A = new long[Ws.length];
		for (int i = 0; i < Ws.length; i++) {
			A[i] = Long.parseLong(Ws[i]);
		}

		String ans = "APPROVED";
		for(int i=0;i<N;i++){
			if(A[i]%2 == 0 && !(A[i]%3==0 || A[i]%5==0)){
				ans="DENIED";
				break;
			}
		}
		System.out.println(ans);

	}

}
