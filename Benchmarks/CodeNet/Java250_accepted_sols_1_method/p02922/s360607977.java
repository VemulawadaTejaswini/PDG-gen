import java.io.*;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		String[] Ws = S.split(" ");

		int A = Integer.parseInt(Ws[0]);
		int B = Integer.parseInt(Ws[1]);


		int sum = 1;
		int ans = 0;
		while(B-sum>0){
			sum=sum-1+A;
			ans++;
		}
		System.out.println(ans);
	}
}
