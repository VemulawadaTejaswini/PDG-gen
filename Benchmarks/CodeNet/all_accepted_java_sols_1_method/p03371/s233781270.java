import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	final static long MOD = 1000000007;
	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();
		String[] Ws = W.split(" ");
		long A = Long.parseLong(Ws[0]);
		long B = Long.parseLong(Ws[1]);
		long C = Long.parseLong(Ws[2]);
		long X = Long.parseLong(Ws[3]);
		long Y = Long.parseLong(Ws[4]);

		//Cを利用しない場合の金額
		long ans = A*X+B*Y;

		//Cを利用する枚数を全探索
		int i=0;
		for(;i<=Math.max(X,Y);i++){
			ans=Math.min(ans, Math.max(0,X-i)*A+Math.max(0,Y-i)*B+C*i*2);
		}

		System.out.println(ans);
	}
}
